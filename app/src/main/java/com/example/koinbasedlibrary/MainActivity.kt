package com.example.koinbasedlibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.firstactivitylibrary.FirstActivity
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

        findViewById<Button>(R.id.third_button).setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }
    }
}
