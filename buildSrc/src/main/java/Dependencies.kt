object Versions {
    const val androidApplication = "8.2.1"
    const val jetbrainsKotlin = "1.9.22"
    const val androidLibrary = "8.2.1"
    const val androidMaterial = "1.11.0"
    const val hilt = "2.46"
    const val navigation = "2.7.6"
}

object Libs {

    object UI {
        const val material = "com.google.android.material:material:${Versions.androidMaterial}"

    }

    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltKapt = "com.google.dagger:hilt-compiler:${Versions.hilt}"

    const val navUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val navFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"

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

