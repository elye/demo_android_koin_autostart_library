package com.example.firstactivitylibrary

import android.os.Bundle
import android.widget.Toast
import com.example.firstactivitylibrary.ui.firstactivity.FirstActivityFragment
import org.koin.android.ext.android.inject
import org.koin.androidx.scope.ScopeActivity
import org.koin.core.component.KoinComponent

class FirstActivity : ScopeActivity(R.layout.first_activity), KoinComponent {

    val myActivityContainer: FirstActivityContainer by inject()
//    val myActivityFragmentContainer: FirstActivityFragmentContainer by inject()

    override fun getKoin() = MyEnvironement.koin!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FirstActivityFragment())
                .commitNow()
        }

        // Make sure myActivityContainer
        // myActivityFragmentContainer is not created at this activity scope as it is only available in Fragment.
        Toast.makeText(this, "${myActivityContainer.text} available in FirstActivity", Toast.LENGTH_SHORT).show()
    }
}
