pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Code Academy Task"
include(":app")
include(":common")
include(":data")
include(":domain")
include(":entities")
include(":features:account")
include(":features:flights")
include(":network")
