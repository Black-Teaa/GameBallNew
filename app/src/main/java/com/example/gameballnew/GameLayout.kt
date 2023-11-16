package com.example.gameballnew

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class GameLayout : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_layout)

        val button_game1: Button = findViewById(R.id.button_game1)
        val rangewidth = 100
        val rangeheight = 100
        val rangex = 0..700
        val rangey = 0..1600
        val rangetext = 5..12

        button_game1.setOnClickListener {

            button_game1.width = rangewidth
            button_game1.height = rangeheight
            button_game1.x = rangex.random().toFloat()
            button_game1.y = rangey.random().toFloat()
            button_game1.textSize = rangetext.random().toFloat()

            }
    }

}
