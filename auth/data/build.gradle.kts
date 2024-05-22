plugins {
    alias(libs.plugins.runaway.android.library)
    alias(libs.plugins.runaway.jvm.ktor)
}

android {
    namespace = "com.galmax.auth.data"
}

dependencies {
    implementation(libs.bundles.koin)

    implementation(projects.auth.domain)
    implementation(projects.core.domain)
    implementation(projects.core.data)
}