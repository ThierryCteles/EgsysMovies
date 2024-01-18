plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.thierrycteles.egsysmovies"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.thierrycteles.egsysmovies"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation ("org.jetbrains.kotlin:kotlin-stdlib:2.0.0-Beta3")
    // ViewModel
    implementation ("androidx.lifecycle:lifecycle-view-model-ktx:2.7.0")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    //Retrofit
    implementation ("com.square.retrofit2:retrofit:2.9.0")
    implementation ("com.square.retrofit2:converter-gson:2.9.0")
    implementation ("androidx.room:room-runtime:2.6.1")
}