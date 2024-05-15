plugins {
    alias(libs.plugins.runaway.android.feature.ui)
}

android {
    namespace = "com.galmax.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)

}