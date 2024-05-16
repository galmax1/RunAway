package com.galmax.convention

import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.DependencyHandlerScope
import java.util.Optional

internal fun DependencyHandlerScope.ksp(
    dependency: Optional<Provider<MinimalExternalModuleDependency>>
) = "ksp"(dependency.get())


internal fun <T> DependencyHandlerScope.implementation(
    dependency: Optional<Provider<T>>
) = "implementation"(dependency.get())

internal fun <T> DependencyHandlerScope.implementation(
    dependency: Provider<T>
) = "implementation"(dependency)


internal fun <T> DependencyHandlerScope.androidTestImplementation(
    dependency: Provider<T>
) = "androidTestImplementation"(dependency)


internal fun <T> DependencyHandlerScope.debugImplementation(
    dependency: Optional<Provider<T>>
) = "debugImplementation"(dependency.get())