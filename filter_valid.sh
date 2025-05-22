#!/usr/bin/env bash
#
# filter_valid.sh — filter out rows whose Rust files produce syntax errors
#                   and skip files containing 'ERROR' in comments
# Usage: filter_valid.sh input.txt > output.txt

input="${1:-/dev/stdin}"

while IFS= read -r line; do
  # If line begins with a number (frequency) followed by a path, test it:
  if [[ "$line" =~ ^[[:space:]]*([0-9]+)[[:space:]]+(/.*\.rs)$ ]]; then
    path="${BASH_REMATCH[2]}"

    # 1) Syntax‐check with nightly Rust, dropping all output:
    if rustc +nightly -Z unpretty=ast-tree "$path" > /dev/null 2>&1; then

      # 2) Ensure there is no 'ERROR' in any line comment (//…ERROR), case-insensitive:
      if ! grep -qiE '//.*ERROR' "$path"; then
        # If both checks passed, emit the original line
        echo "$line"
      fi
    fi
  else
    # Not a data row (header, separator, blank) → print as-is
    echo "$line"
  fi
done < "$input"
