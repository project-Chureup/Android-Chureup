// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    val kotlinVersion = "2.0.0"
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("org.jetbrains.kotlin.plugin.compose") version kotlinVersion apply false

    // kotlinx.serialization
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    // hilt
    id("com.google.dagger.hilt.android") version "2.51.1" apply false
}