package com.example.firstactivitylibrary

import android.content.Context
import androidx.startup.Initializer
import org.koin.android.ext.koin.androidContext
import org.koin.core.Koin
import org.koin.dsl.koinApplication

object MyEnvironement {
    var koin: Koin? = null
}

internal class ActivityLibInitializer : Initializer<Koin> {

    override fun create(context: Context): Koin {
        val koin = koinApplication {
            androidContext(context)
            modules(myModule)
        }.koin

        MyEnvironement.koin = koin

        return koin
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}