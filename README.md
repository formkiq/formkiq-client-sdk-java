# FormKiQ Java Client Library
This is the official supported Java library for the FormKiQ API. 

Requires Java 11 or greater.

Please visit http://www.formkiq.com  directly with any issues that need attention.

## Documentation
General documentation for FormKiQ can be found here: http://docs.formkiq.com/.

## Installation
Clone the repository, and use

```
    ./gradlew build
```

to build the jar. Add the jar, located at a path similar to:

```
    build/libs/formkiq-java-client-<version>.jar
```

If you would like a copy of the javadocs, use

```
    ./gradlew javadoc
```

the javadoc documentation is located at path

```
    build/docs/javadoc/
```


Maven Installation
------------------

Add the following to your pom.xml

```xml
    <!-- FormKiQ Client Library Dependency -->
    <dependency>
        <groupId>com.formkiq.stacks</groupId>
        <artifactId>client</artifactId>
        <version>VERSION</version>
        <!-- Replace VERSION with the version you want to use -->
    </dependency>
```

Gradle Installation
------------------

Add the following to your build.gradle

```
   implementation group: 'com.formkiq.stacks', name: 'client', version:'VERSION'
   <!-- Replace VERSION with the version you want to use -->
```