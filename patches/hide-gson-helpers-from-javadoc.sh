#!/bin/sh
set -eu

# Keep generated Gson adapter factories out of the SDK's public Javadoc.
root=$(CDPATH= cd -- "$(dirname -- "$0")/.." && pwd)
tmp=""
trap 'if [ -n "$tmp" ]; then rm -f "$tmp"; fi' 0

for file in "$root"/src/main/java/com/formkiq/client/model/*.java; do
  [ -f "$file" ] || continue
  tmp="${file}.tmp"

  awk '
    /^[[:space:]]*\/\*\*/ {
      in_comment = 1
      hidden = 0
    }

    in_comment && /@hidden/ { hidden = 1 }

    /^[[:space:]]*public static class CustomTypeAdapterFactory implements TypeAdapterFactory \{[[:space:]]*$/ {
      if (!hidden) {
        match($0, /^[[:space:]]*/)
        print substr($0, 1, RLENGTH) "/** @hidden */"
      }
    }

    {
      print
      if (in_comment) {
        if (index($0, "*/")) {
          in_comment = 0
        }
      } else if ($0 !~ /^[[:space:]]*$/) {
        hidden = 0
      }
    }
  ' "$file" > "$tmp"

  if cmp -s "$file" "$tmp"; then
    rm -f "$tmp"
  else
    mv "$tmp" "$file"
  fi
  tmp=""
done
