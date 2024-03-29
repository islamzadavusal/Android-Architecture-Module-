object Versions {
    const val androidApplication = "8.2.1"
    const val jetbrainsKotlin = "1.9.22"
    const val androidMaterial = "1.11.0"
    const val hilt = "2.46"
    const val navigation = "2.7.6"

    const val retrofit = "2.9.0"
    const val okhttpLogging = "4.10.0"
    const val okhttp = "5.0.0-alpha.3"
    const val gson = "2.10.1"
}

object Libs {

    object UI {
        const val material = "com.google.android.material:material:${Versions.androidMaterial}"

    }

    object HILT {
        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltKapt = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    }

    object NAV {
        const val navUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
        const val navFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    }
    
    object Api {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
        const val gson = "com.google.code.gson:gson:${Versions.gson}"
    }


}

object Plugins {
    const val androidApplication = "com.android.application"
    const val jetbrainsKotlin = "org.jetbrains.kotlin.android"
    const val hilt = "dagger.hilt.android.plugin"
    const val kotlinKapt = "kotlin-kapt"
    const val parcelize = "kotlin-parcelize"
}

object Classpath {
    const val hilt =  "com.google.dagger.hilt.android"
}

