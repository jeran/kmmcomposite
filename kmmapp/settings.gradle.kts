pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

includeBuild("../kmmlib")

rootProject.name = "kmm_app"
include(":androidApp")
include(":shared")