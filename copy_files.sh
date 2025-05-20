#!/usr/bin/env bash
set -euo pipefail

if [[ $# -ne 2 ]]; then
  echo "Usage: $0 <input_list.txt> <destination_root>"
  exit 1
fi

input_file="$1"
dest_root="$2"

# Make sure destination exists
mkdir -p "$dest_root"

while IFS= read -r line; do
  # Match lines like: <whitespace><number><whitespace><absolute-path>.rs
  if [[ "$line" =~ ^[[:space:]]*[0-9]+[[:space:]]+(/.+\.rs)$ ]]; then
    full_path="${BASH_REMATCH[1]}"

    # Compute the part after 'rust_repos/'
    # (we assume every matched path contains 'rust_repos/')
    rel_path="${full_path#*rust_repos/}"

    # Build the destination path
    dest_path="$dest_root/$rel_path"

    # Create parent directory if needed
    mkdir -p "$(dirname "$dest_path")"

    # Copy the file (preserving attributes)
    cp -p "$full_path" "$dest_path"
    echo "Copied: $rel_path"
  fi
done < "$input_file"
