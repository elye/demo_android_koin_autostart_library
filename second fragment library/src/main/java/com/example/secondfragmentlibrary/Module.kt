package com.example.secondfragmentlibrary

import org.koin.dsl.module

class SecondContainer(val text: String = "Second Container")

val myModule =
    module {
        scope<SecondFragment> {
            scoped { SecondContainer() }
        }
    }
