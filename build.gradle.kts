plugins {
    application
    idea
}

group = "au.com.rainmore"
version = "1.0.0"
description = "Hacker Rank Practice"

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
    mainClass.set(listOf(project.group.toString(), "TestJava").joinToString("."))
}

tasks.named<Wrapper>("wrapper").configure {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = project.properties["gradle.version"] as String
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("-Xlint:unchecked")
}


tasks.run.configure {
    standardInput = System.`in`
}

dependencies {
    implementation("org.apache.commons:commons-lang3:${project.properties["commons-lang3.version"]!!}")
    implementation("org.slf4j:slf4j-api:${project.properties["slf4j.version"]!!.toString()}")
    implementation("org.slf4j:slf4j-simple:${project.properties["slf4j.version"]!!.toString()}")
    testImplementation(platform("org.junit:junit-bom:${project.properties["junit.version"]!!.toString()}"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

sourceSets.main.get().java.srcDirs.clear()
