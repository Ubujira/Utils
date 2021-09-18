[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=InsanityDeveloper_Utils&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=InsanityDeveloper_Utils)
# Utils
Contains a few utils which I use all the time.

## Obtaining

You can obtain this library from JitPack.

**Maven**
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
```xml
<dependency>
    <groupId>com.github.InsanityDeveloper</groupId>
    <artifactId>Utils</artifactId>
    <version>v1.1</version>
</dependency>
```

**Gradle**
```gradle
repositories {
    maven { url 'https://jitpack.io' }
}
```
```gradle
dependencies {
    implementation 'com.github.InsanityDeveloper:Utils:1.1'
}
```

## JsonUtils
Contains two methods to either read a json element from a file or write a json object to a file.

## ColorUtils
Contains two methods to create a random color w/o adjusted brightness.
