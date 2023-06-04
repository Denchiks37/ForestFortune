package com.example.forestfortune

import android.content.Intent
import android.icu.text.CaseMap.Title
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_activity_screen)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        GameText = findViewById(R.id.GameText)
        GameImage = findViewById(R.id.GameImage)
        choice1 = findViewById(R.id.choice1)
        choice2 = findViewById(R.id.choice2)
        choice3 = findViewById(R.id.choice3)
        choice4 = findViewById(R.id.choice4)
        story.startPoint()

        choice1.setOnClickListener{

            story.selectPosition(story.nextPosition1)
        }
        choice2.setOnClickListener{

            story.selectPosition(story.nextPosition2)
        }
        choice3.setOnClickListener{

            story.selectPosition(story.nextPosition3)
        }
        choice4.setOnClickListener{

            story.selectPosition(story.nextPosition4)
        }

    }

    fun goTitleScreen(){

        val titleScreen = Intent(this, TitleScreen::class.java)
        startActivity(titleScreen)
    }

    val story = Story( ga = this)

    lateinit var GameText: TextView
    lateinit var GameImage: ImageView
    lateinit var choice1: Button
    lateinit var choice2: Button
    lateinit var choice3: Button
    lateinit var choice4: Button

}