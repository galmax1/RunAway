plugins {
    alias(libs.plugins.runaway.android.feature.ui)
}

android {
    namespace = "com.galmax.analytics.presentation"
}

dependencies {
    implementation(projects.analytics.domain)
}