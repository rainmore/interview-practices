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
    implementation("org.slf4j:slf4j-api:${project.properties["slf4j.version"]!!.toString()}")
    implementation("org.slf4j:slf4j-simple:${project.properties["slf4j.version"]!!.toString()}")
    testImplementation(platform("org.junit:junit-bom:${project.properties["junit.version"]!!.toString()}"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
