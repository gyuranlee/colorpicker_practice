pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
        maven {url = uri("https://jitpack.io")}
        maven { url = uri("https://maven.google.com")}
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        google()
        maven {url = uri("https://jitpack.io")}
        maven { url = uri("https://maven.google.com")}
    }
}


rootProject.name = "colorpicker_practice"
include(":app")}
