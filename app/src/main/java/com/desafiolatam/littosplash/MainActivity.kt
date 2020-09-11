package com.desafiolatam.littosplash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(2000)
        Toast.makeText( applicationContext,"ManoNegra Object Access Interface ", Toast.LENGTH_LONG).show()
        setTheme(R.style.AppTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


