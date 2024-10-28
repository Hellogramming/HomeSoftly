plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.appgramming.homesoftly"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.appgramming.homesoftly"
        minSdk = 16
        targetSdk = 34
        versionCode = 3
        versionName = "1.2"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
}