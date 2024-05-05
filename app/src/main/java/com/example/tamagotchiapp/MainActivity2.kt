package com.example.tamagotchiapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge

class MainActivity2() : AppCompatActivity() {
    //declare
    private lateinit var imageView: ImageView
    private lateinit var Foodbutton: Button
    private lateinit var Cleanbutton: Button
    private lateinit var Playbutton: Button
    private lateinit var Feedbar: ProgressBar
    private lateinit var Cleanbar: ProgressBar
    private lateinit var Playbar: ProgressBar

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        //intialise
        imageView = findViewById(R.id.imageView2)
        Foodbutton = findViewById(R.id.Foodbutton)
        Cleanbutton = findViewById(R.id.Cleanbutton)
        Playbutton = findViewById(R.id.Playbutton)
        Feedbar = findViewById(R.id.FeedBar)
        Cleanbar = findViewById(R.id.CleanBar)
        Playbar = findViewById(R.id.PlayBar)

        // increase the progressbar by 50

        Foodbutton.setOnClickListener {
            imageView.setImageResource(R.drawable.img_2)
            Feedbar.incrementProgressBy(25)
        }

        Cleanbutton.setOnClickListener {
            imageView.setImageResource(R.drawable.img_3)
            Cleanbar.incrementProgressBy(25)
        }

        Playbutton.setOnClickListener {
            imageView.setImageResource(R.drawable.img_4)
            Playbar.incrementProgressBy(25)

        }
    }
}