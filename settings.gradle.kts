pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        mavenCentral()
        google()
    }
    
}
rootProject.name = "DesktopDesigner"


include(":desktop")
include(":common")
include(":reusableUI")

