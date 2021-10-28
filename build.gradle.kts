buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("com.android.tools.build:gradle:7.0.0")
    }
}

group = "eu.kotin.koders"
version = "1.0"

allprojects {
    repositories {
        mavenCentral()
    }
}