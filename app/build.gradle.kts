plugins {
    application
}

group = "io.github.stackunderflow111"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":lib"))
    implementation("org.mapstruct:mapstruct:1.4.2.Final")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.4.2.Final")
}

application {
    mainClass.set("io.github.stackunderflow111.Main")
}