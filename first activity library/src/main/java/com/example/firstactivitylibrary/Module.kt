package com.example.firstactivitylibrary

import com.example.firstactivitylibrary.ui.firstactivity.FirstActivityFragment
import org.koin.dsl.module

class FirstActivityContainer(val text: String = "First Activity Container")
class FirstActivityFragmentContainer(val text: String = "First Activity Fragment Container")

val myModule =
    module {
        scope<FirstActivity> {
            scoped { FirstActivityContainer() }
        }
        scope<FirstActivityFragment> {
            scoped { FirstActivityFragmentContainer() }
        }
    }
