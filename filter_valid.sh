#!/usr/bin/env bash
#
# filter_valid.sh — filter out rows whose Rust files produce syntax errors
# Usage: filter_valid.sh input.txt > output.txt

input="${1:-/dev/stdin}"

while IFS= read -r line; do
  # If line begins with a number (frequency) followed by a path, test it:
  if [[ "$line" =~ ^[[:space:]]*([0-9]+)[[:space:]]+(/.*\.rs)$ ]]; then
    path="${BASH_REMATCH[2]}"
    # Run nightly parser to dump AST (syntax check only), drop its stdout,
    # keep only stderr so we detect errors :contentReference[oaicite:0]{index=0},
    # and combine streams so exit code reflects errors :contentReference[oaicite:1]{index=1}
    if rustc +nightly -Z unpretty=ast-tree "$path" \
         > /dev/null 2>&1; then
      # No stderr → valid syntax → print the original line
      echo "$line"
    fi
  else
    # Not a data row (header, separator, blank) → print as-is
    echo "$line"
  fi
done < "$input"
