package com.example.firstactivitylibrary.ui.firstactivity

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.startup.AppInitializer
import com.example.firstactivitylibrary.*
import com.example.firstactivitylibrary.ActivityLibInitializer
import org.koin.android.ext.android.inject
import org.koin.androidx.scope.ScopeActivity
import org.koin.androidx.scope.ScopeFragment
import org.koin.androidx.scope.createScope
import org.koin.core.Koin
import org.koin.core.component.KoinComponent
import org.koin.core.component.KoinScopeComponent
import org.koin.core.scope.Scope

class FirstActivityFragment : ScopeFragment(R.layout.first_activity_fragment), KoinComponent {

    val myActivityContainer: FirstActivityContainer by inject()
    val myActivityFragmentContainer: FirstActivityFragmentContainer by inject()

    override fun getKoin() = MyEnvironement.koin!!

    private lateinit var viewModel: FirstActivityViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FirstActivityViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.message).text =
            myActivityContainer.text + " " + myActivityFragmentContainer.text
    }
}