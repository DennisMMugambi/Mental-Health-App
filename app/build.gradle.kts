plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("com.google.gms.google-services")
    id("kotlin-kapt")
    id("kotlin-parcelize")
}

android {
    namespace = "com.example.mindfullnessnewdesign"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.mindfullnessnewdesign"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }

    buildTypes {
        release {
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}


// Allow references to generated code
kapt {
    correctErrorTypes = true
}

dependencies {


    //Dagger - Hilt
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-android-compiler:2.44")
//    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.1.0-alpha01")
//    kapt("androidx.hilt:hilt-compiler:2.44")
//    implementation("androidx.hilt:hilt-navigation-compose:1.1.0-alpha01")


    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation("androidx.navigation:navigation-ui-ktx:2.6.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //firebase
    implementation("com.google.firebase:firebase-auth:21.0.3")
    implementation("com.google.android.gms:play-services-auth:20.4.1")

    // Import the Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:32.2.2"))
    implementation("com.google.firebase:firebase-analytics-ktx")


    //Lottie
    implementation("com.airbnb.android:lottie:3.5.0")

    // Room
    implementation("androidx.room:room-runtime:2.2.5")
    kapt("androidx.room:room-compiler:2.2.5")
    implementation("androidx.room:room-ktx:2.2.5")

    // DataStore
    implementation("androidx.datastore:datastore-preferences:1.0.0")

    //Timber Logging
    implementation("com.jakewharton.timber:timber:4.7.1")

    //Navigation UI
    implementation("androidx.navigation:navigation-ui-ktx:2.3.5")

    //firebase
    implementation("com.google.firebase:firebase-core:9.6.1")

    //circle image view
    implementation("de.hdodenhof:circleimageview:3.1.0")

    //tab indicator
    implementation("com.tbuonomo:dotsindicator:5.0")

}