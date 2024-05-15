plugins {
    alias(libs.plugins.runaway.jvm.library)
}

dependencies {
    implementation(projects.core.domain)
}