import androidx.room.gradle.RoomExtension
import com.galmax.convention.implementation
import com.galmax.convention.ksp
import com.galmax.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidRoomConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("androidx.room")
                apply("com.google.devtools.ksp")
            }

            extensions.configure<RoomExtension> {
                schemaDirectory("$rootDir/schemas")
            }

            dependencies {
                implementation(libs.findLibrary("room.runtime"))
                implementation(libs.findLibrary("room.ktx"))
                ksp(libs.findLibrary("room.compiler"))
            }
        }
    }
}