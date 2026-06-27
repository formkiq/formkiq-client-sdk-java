#!/bin/sh
set -eu

file="src/main/java/com/formkiq/client/model/MappingAttribute.java"
tmp="${file}.tmp"

awk '
function brace_delta(line,    i, ch, delta) {
  delta = 0
  for (i = 1; i <= length(line); i++) {
    ch = substr(line, i, 1)
    if (ch == "{") {
      delta++
    } else if (ch == "}") {
      delta--
    }
  }
  return delta
}

function print_replacement() {
  print "    public static void validateJsonElement(JsonElement jsonElement) throws IOException {"
  print "        JsonObject jsonObject = jsonElement.getAsJsonObject();"
  print "        JsonElement discriminatorElement = jsonObject.get(\"sourceType\");"
  print ""
  print "        if (discriminatorElement == null || discriminatorElement.isJsonNull()) {"
  print "            throw new IOException(String.format(java.util.Locale.ROOT, \"Failed to lookup discriminator value for MappingAttribute as `sourceType` was not found in the payload or the payload is empty. JSON: %s\", jsonElement.toString()));"
  print "        }"
  print ""
  print "        if (!discriminatorElement.isJsonPrimitive()) {"
  print "            throw new IOException(String.format(java.util.Locale.ROOT, \"Expected discriminator field `sourceType` for MappingAttribute to be a primitive value. JSON: %s\", jsonElement.toString()));"
  print "        }"
  print ""
  print "        String discriminatorValue = discriminatorElement.getAsString();"
  print "        switch (discriminatorValue) {"
  print "            case \"CONTENT\":"
  print "            case \"CONTENT_KEY_VALUE\":"
  print "                MappingAttributeContent.validateJsonElement(jsonElement);"
  print "                return;"
  print "            case \"DATA_CLASSIFICATION\":"
  print "                MappingAttributeDataClassification.validateJsonElement(jsonElement);"
  print "                return;"
  print "            case \"MALWARE_SCAN\":"
  print "                MappingAttributeMalwareScan.validateJsonElement(jsonElement);"
  print "                return;"
  print "            case \"MANUAL\":"
  print "                MappingAttributeManual.validateJsonElement(jsonElement);"
  print "                return;"
  print "            case \"METADATA\":"
  print "                MappingAttributeMetadata.validateJsonElement(jsonElement);"
  print "                return;"
  print "            case \"METADATA_EXTRACTION_RESULT\":"
  print "                MappingAttributeMetadataExtractionResult.validateJsonElement(jsonElement);"
  print "                return;"
  print "            case \"AI_PROMPT_RESULT\":"
  print "                MappingAttributeAiPromptResult.validateJsonElement(jsonElement);"
  print "                return;"
  print "            default:"
  print "                throw new IOException(String.format(java.util.Locale.ROOT, \"Failed to lookup discriminator value `%s` for MappingAttribute. Possible values: CONTENT CONTENT_KEY_VALUE DATA_CLASSIFICATION MALWARE_SCAN MANUAL METADATA METADATA_EXTRACTION_RESULT AI_PROMPT_RESULT\", discriminatorValue));"
  print "        }"
  print "    }"
}

/^[[:space:]]*public static void validateJsonElement\(JsonElement jsonElement\) throws IOException \{/ && replaced == 0 {
  print_replacement()
  skipping = 1
  replaced = 1
  depth = brace_delta($0)
  next
}

skipping {
  depth += brace_delta($0)
  if (depth == 0) {
    skipping = 0
  }
  next
}

{ print }

END {
  if (replaced != 1) {
    print "Failed to patch MappingAttribute.validateJsonElement" > "/dev/stderr"
    exit 1
  }
}
' "$file" > "$tmp"

mv "$tmp" "$file"

file="src/main/java/com/formkiq/client/model/MappingClassificationCondition.java"
tmp="${file}.tmp"

awk '
function brace_delta(line,    i, ch, delta) {
  delta = 0
  for (i = 1; i <= length(line); i++) {
    ch = substr(line, i, 1)
    if (ch == "{") {
      delta++
    } else if (ch == "}") {
      delta--
    }
  }
  return delta
}

function print_replacement() {
  print "    public static void validateJsonElement(JsonElement jsonElement) throws IOException {"
  print "        JsonObject jsonObject = jsonElement.getAsJsonObject();"
  print "        JsonElement discriminatorElement = jsonObject.get(\"sourceType\");"
  print ""
  print "        if (discriminatorElement == null || discriminatorElement.isJsonNull()) {"
  print "            throw new IOException(String.format(java.util.Locale.ROOT, \"Failed to lookup discriminator value for MappingClassificationCondition as `sourceType` was not found in the payload or the payload is empty. JSON: %s\", jsonElement.toString()));"
  print "        }"
  print ""
  print "        if (!discriminatorElement.isJsonPrimitive()) {"
  print "            throw new IOException(String.format(java.util.Locale.ROOT, \"Expected discriminator field `sourceType` for MappingClassificationCondition to be a primitive value. JSON: %s\", jsonElement.toString()));"
  print "        }"
  print ""
  print "        String discriminatorValue = discriminatorElement.getAsString();"
  print "        switch (discriminatorValue) {"
  print "            case \"CONTENT\":"
  print "                MappingClassificationConditionContent.validateJsonElement(jsonElement);"
  print "                return;"
  print "            case \"DATA_CLASSIFICATION\":"
  print "                MappingClassificationConditionDataClassification.validateJsonElement(jsonElement);"
  print "                return;"
  print "            case \"METADATA_EXTRACTION_RESULT\":"
  print "                MappingClassificationConditionMetadataExtractionResult.validateJsonElement(jsonElement);"
  print "                return;"
  print "            case \"AI_PROMPT_RESULT\":"
  print "                MappingClassificationConditionAiPromptResult.validateJsonElement(jsonElement);"
  print "                return;"
  print "            default:"
  print "                throw new IOException(String.format(java.util.Locale.ROOT, \"Failed to lookup discriminator value `%s` for MappingClassificationCondition. Possible values: CONTENT DATA_CLASSIFICATION METADATA_EXTRACTION_RESULT AI_PROMPT_RESULT\", discriminatorValue));"
  print "        }"
  print "    }"
}

/^[[:space:]]*public static void validateJsonElement\(JsonElement jsonElement\) throws IOException \{/ && replaced == 0 {
  print_replacement()
  skipping = 1
  replaced = 1
  depth = brace_delta($0)
  next
}

skipping {
  depth += brace_delta($0)
  if (depth == 0) {
    skipping = 0
  }
  next
}

{ print }

END {
  if (replaced != 1) {
    print "Failed to patch MappingClassificationCondition.validateJsonElement" > "/dev/stderr"
    exit 1
  }
}
' "$file" > "$tmp"

mv "$tmp" "$file"
