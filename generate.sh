#!/bin/bash
set -euo pipefail

rm -r -f src

openapi-generator generate -g java -i https://raw.githubusercontent.com/formkiq/formkiq-core/refs/heads/master/docs/openapi/openapi-jwt.yaml -o . --additional-properties apiPackage=com.formkiq.client.api --additional-properties invokerPackage=com.formkiq.client.invoker --additional-properties modelPackage=com.formkiq.client.model --additional-properties groupId=com.formkiq --additional-properties artifactId=client --additional-properties withAWSV4Signature=true --additional-properties useOneOfDiscriminatorLookup=true

sh patches/apply-mapping-attribute-discriminator-validation.sh

git restore build.gradle gradle/wrapper/gradle-wrapper.properties

./gradlew clean build
