plugins {
    kotlin("jvm") version "1.8.0"
    application
}

val revision: String by project
group = "dev.troublemaker.example"
version = "1.0${revision}"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}