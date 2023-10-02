package ru.mggtk.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var check = false

    fun buttonClick(view: View){
        val button = findViewById<Button>(R.id.button)
        var imagePlace = findViewById<ImageView>(R.id.imageView2)

        button.setOnClickListener{
            imagePlace.setImageResource(R.drawable.pear)
        }
    }

    fun imageButtonClick(view: View){
        val imageButton = findViewById<ImageButton>(R.id.imageButton)

        imageButton.setOnClickListener {
        imageButton.setImageResource(R.drawable.btn_check_buttonless_on)
        }

    }


}