package com.example.firstfragmentlibrary

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.startup.AppInitializer
import org.koin.android.ext.android.inject
import org.koin.androidx.scope.createScope
import org.koin.core.Koin
import org.koin.core.component.KoinScopeComponent
import org.koin.core.scope.Scope

class FirstFragment : Fragment(R.layout.fragment_first), KoinScopeComponent {

    override val scope: Scope by lazy { createScope(this) }
    val myContainer: FirstContainer by inject()

    private val myKoin: Koin by lazy {
        AppInitializer.getInstance(this.requireContext())
            .initializeComponent(FirstLibInitializer::class.java)
    }
    override fun getKoin() = myKoin

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.mytext).text = myContainer.text
    }
}
