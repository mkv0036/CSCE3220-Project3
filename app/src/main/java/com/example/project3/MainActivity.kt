package com.example.project3

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.project3.R
import android.widget.Button
import android.widget.ImageView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        button1.setOnClickListener {
            // Change the image in the ImageView when the button is clicked
            imageView.setImageResource(R.drawable.summer)
        }

        button2.setOnClickListener {
            // Change the image in the ImageView when the button is clicked
            imageView.setImageResource(R.drawable.fall)
        }

        button3.setOnClickListener {
            // Change the image in the ImageView when the button is clicked
            imageView.setImageResource(R.drawable.winter)
        }

    }


}
