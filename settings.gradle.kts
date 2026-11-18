pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net/")

        gradlePluginPortal()
    }
}

rootProject.name = "CrashDummy"

include("paper", "fabric")