package com.example.koinbasedlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.firstfragmentlibrary.FirstFragment
import com.example.secondfragmentlibrary.SecondFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.first_button).setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.container, FirstFragment()).commit()
        }

        findViewById<Button>(R.id.second_button).setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.container, SecondFragment()).commit()
        }
    }
}
