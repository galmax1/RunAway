plugins {
    alias(libs.plugins.runaway.android.library)
}

android {
    namespace = "com.galmax.analytics.data"
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)

    implementation(projects.core.database)
    implementation(projects.core.domain)
    implementation(projects.analytics.domain)
}