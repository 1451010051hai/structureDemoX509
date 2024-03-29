package com.f88.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var BtnRoll : Button =  findViewById(R.id.rollBtn);
        BtnRoll.setOnClickListener{
            distRoll();
        }
    }

    private fun distRoll() {
        var imgDist : ImageView = findViewById(R.id.imgView);
        var randomInt = Random().nextInt(6) + 1;
        var drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        imgDist.setImageResource(drawableResource)
    }

}