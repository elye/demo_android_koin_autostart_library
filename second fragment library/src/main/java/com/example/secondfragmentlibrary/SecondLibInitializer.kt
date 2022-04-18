package com.example.secondfragmentlibrary

import android.content.Context
import androidx.startup.Initializer
import org.koin.android.ext.koin.androidContext
import org.koin.core.Koin
import org.koin.core.KoinApplication
import org.koin.dsl.koinApplication

internal class SecondLibInitializer : Initializer<Koin> {

    override fun create(context: Context): Koin {
        return koinApplication {
            androidContext(context)
            modules(myModule)
        }.koin
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}