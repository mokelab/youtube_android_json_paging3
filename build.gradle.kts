buildscript {
    val compose_version: String by extra("1.2.0")
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application").version("7.4.0").apply(false)
    id("com.android.library").version("7.4.0").apply(false)
    id("org.jetbrains.kotlin.android").version("1.7.0").apply(false)
}