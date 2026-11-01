plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.davion.safesign"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.davion.safesign"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
