pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        mavenCentral()
        google()
    }

    plugins {
        id("org.jetbrains.compose").version("1.2.0")
        kotlin("multiplatform").version("1.7.20")
    }
    
}
rootProject.name = "DesktopDesigner"


include(
    ":desktop",
    ":common",
    ":reusableUI"
)

