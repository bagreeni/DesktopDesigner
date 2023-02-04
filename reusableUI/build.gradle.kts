import org.jetbrains.compose.compose

plugins {
    kotlin("multiplatform") version "1.5.10"
    id("org.jetbrains.compose") version "0.4.0"
}

group = "com.bronk"
version = "1.0"

repositories {
    google()
}

kotlin {
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val desktopMain by getting
        val desktopTest by getting
    }
}
