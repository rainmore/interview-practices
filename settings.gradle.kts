rootProject.name = "hacker-rank"

pluginManagement {
    plugins {
        id("org.gradle.toolchains.foojay-resolver-convention").version(settings.extra["plugin.foojay.version"]!!.toString())
    }

    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}
