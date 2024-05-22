plugins {
    alias(libs.plugins.runaway.android.library)
    alias(libs.plugins.runaway.jvm.ktor)
}

android {
    namespace = "com.galmax.core.data"
}

dependencies {
    implementation(libs.timber)
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}