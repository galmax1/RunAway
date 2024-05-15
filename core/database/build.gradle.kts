plugins {
    alias(libs.plugins.runaway.android.library)
    alias(libs.plugins.runaway.android.room)
}

android {
    namespace = "com.galmax.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}