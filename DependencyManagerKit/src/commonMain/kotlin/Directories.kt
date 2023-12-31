package dependency.manager.kit

object Directories {
    fun cacheDirectory(): String {
        return ".tool_cache"
    }

    fun resolvedFile(dependency: Dependency): String {
        return "${dependencyDirectoryOfExactVersion(dependency, dependency.version)}/Resolved.json"
    }

    fun dependencyDirectory(dependency: Dependency): String {
        return "${cacheDirectory()}/${dependency.groupId.replace(".", "/")}/${dependency.artifactId}"
    }

    private fun dependencyDirectoryOfExactVersion(dependency: Dependency, version: String): String {
        return "${cacheDirectory()}/${dependency.groupId.replace(".", "/")}/${dependency.artifactId}/${version}"
    }
}