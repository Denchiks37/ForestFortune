package com.example.forestfortune

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class TitleScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.title_activity_screen)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        initialiseViews()
    }
    lateinit var Start: Button

    private fun initialiseViews() {
        Start = findViewById(R.id.startButton)

        setupClickListeners()
    }

    private fun setupClickListeners() {
        Start.setOnClickListener(){
            startActivity(
                Intent(this@TitleScreen, GameActivity::class.java)
            )
        }
    }

}