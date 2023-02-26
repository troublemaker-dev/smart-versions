# smart-versions
A demo project to show how easy I think customizing versions on the pipeline should be.

Starting with a standard JetBrains-created Gradle Kotlin project, I added the revision project property to gradle.properties.
Then, add that project property to `build.gradle.kts` and modify version to consume this property.

Running gradle with zero other options, will use this data to create a version-SNAPSHOT by default. 
Passing `-Prevision=-custom-revision-data` will cause Gradle to create a version as `version-custom-revision-data` instead.
Passing `-Prevision=` will cause Gradle to build a release version of `version`.