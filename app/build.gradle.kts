plugins {
    id("com.android.application") version "8.5.0"
}

android {
    namespace = "com.google.android.contactkeys"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.google.android.contactkeys"
        minSdk = 24
        targetSdk = 34
        versionCode = 2000000000
        versionName = "2000000000"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}