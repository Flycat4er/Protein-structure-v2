package org.example.proteinstructure

class JsPlatform : Platform {
    override val name: String = "JavaScript"
}

actual fun getPlatform(): Platform = JsPlatform()

actual fun setAppLocale(language: String) {}

actual fun getAppLocale(): String = "ru"
