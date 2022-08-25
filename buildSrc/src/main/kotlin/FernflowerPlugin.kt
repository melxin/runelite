import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.register

class FernflowerPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register<FernflowerTask>("decompile")
    }
}