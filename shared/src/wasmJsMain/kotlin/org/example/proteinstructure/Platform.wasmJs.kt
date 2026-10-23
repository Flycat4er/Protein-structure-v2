package org.example.proteinstructure

class WasmPlatform : Platform {
    override val name: String = "WebAssembly"
}

actual fun getPlatform(): Platform = WasmPlatform()

actual fun setAppLocale(language: String) {}

actual fun getAppLocale(): String = "ru"
