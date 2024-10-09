plugins {
    alias(libs.plugins.runaway.android.library)
}

android {
    namespace = "com.galmax.wear.run.data"

    defaultConfig {
        minSdk = 30
    }
}

dependencies {
    implementation(libs.androidx.health.services.client)
    implementation(libs.bundles.koin)
}