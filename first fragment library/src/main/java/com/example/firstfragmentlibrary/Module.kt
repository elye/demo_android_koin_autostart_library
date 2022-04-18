package com.example.firstfragmentlibrary

import org.koin.dsl.module

class FirstContainer(val text: String = "First Container")

val myModule =
    module {
        scope<FirstFragment> {
            scoped { FirstContainer() }
        }
    }
