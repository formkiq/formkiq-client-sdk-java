#!/bin/bash

rm -r -f src

openapi-generator generate -g java -i /Users/mike/Documents/github/formkiq-core/docs/openapi/openapi-jwt.yaml -o . --additional-properties apiPackage=com.formkiq.client.api --additional-properties invokerPackage=com.formkiq.client.invoker --additional-properties modelPackage=com.formkiq.client.model --additional-properties groupId=com.formkiq --additional-properties artifactId=client --additional-properties withAWSV4Signature=true

#openapi-generator generate -g java -i https://raw.githubusercontent.com/formkiq/formkiq-core/v1.15.0/docs/openapi/openapi-jwt.yaml -o . --additional-properties apiPackage=com.formkiq.client.api --additional-properties invokerPackage=com.formkiq.client.invoker --additional-properties modelPackage=com.formkiq.client.model --additional-properties groupId=com.formkiq --additional-properties artifactId=client --additional-properties withAWSV4Signature=true

git restore build.gradle
git restore ./src/main/java/com/formkiq/client/invoker/auth/AWS4Auth.java
git restore ./src/main/java/com/formkiq/client/invoker/ApiClient.java
git restore ./src/main/java/com/formkiq/client/invoker/auth/StringContentStreamProvider.java

./gradlew clean build
