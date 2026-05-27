plugins {
    kotlin("jvm") version "2.3.10"
}

group = "dreamus"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.reflections:reflections:0.10.2")
    implementation("org.jetbrains.kotlin:kotlin-reflect:2.3.21")
    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.27.7")
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}