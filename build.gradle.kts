plugins {
    application
    idea
}

group = "au.com.rainmore"
version = "1.0.0"
description = "Interview Setup"

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
        vendor.set(JvmVendorSpec.ADOPTIUM)
        implementation.set(JvmImplementation.VENDOR_SPECIFIC)
    }
}

application {
    mainClass.set(listOf(project.group.toString(), "Application").joinToString("."))
}

tasks.run.configure {
    standardInput = System.`in`
}

dependencies {
    implementation("org.apache.commons:commons-lang3:${project.properties["commons-lang3.version"]!!}")
    implementation("org.slf4j:slf4j-api:${project.properties["slf4j.version"]!!}")
    implementation("org.slf4j:slf4j-simple:${project.properties["slf4j.version"]!!}")
    testImplementation(platform("org.junit:junit-bom:${project.properties["junit.version"]!!}"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
