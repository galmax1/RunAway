plugins {
    alias(libs.plugins.runaway.android.library.compose)
}

android {
    namespace = "com.galmax.core.presentation.designsystem_wear"

    defaultConfig {
        minSdk = 30
    }
}

dependencies {
    api(projects.core.presentation.designsystem)

    implementation(libs.androidx.wear.compose.material)
}