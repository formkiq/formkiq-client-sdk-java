#!/bin/bash

rm -r -f src

openapi-generator generate -g java -i https://raw.githubusercontent.com/formkiq/formkiq-core/139-add-permissions-to-documents-post-patch-documentsdocumentid/docs/openapi/openapi-jwt.yaml -o . --additional-properties apiPackage=com.formkiq.client.api --additional-properties invokerPackage=com.formkiq.client.invoker --additional-properties modelPackage=com.formkiq.client.model --additional-properties groupId=com.formkiq --additional-properties artifactId=client

git restore build.gradle
