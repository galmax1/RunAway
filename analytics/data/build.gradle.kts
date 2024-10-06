plugins {
    alias(libs.plugins.runaway.android.library)
    alias(libs.plugins.runaway.android.room)
}

android {
    namespace = "com.galmax.analytics.data"
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.bundles.koin)

    implementation(projects.core.database)
    implementation(projects.core.domain)
    implementation(projects.analytics.domain)
}