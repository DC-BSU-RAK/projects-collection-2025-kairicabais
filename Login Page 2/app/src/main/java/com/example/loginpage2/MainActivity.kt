package com.example.loginpage2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.media.AudioAttributes
import android.media.MediaPlayer


class MainActivity : AppCompatActivity() {


    private lateinit var imageView: ImageView
    private lateinit var imageButton1: ImageButton
    private lateinit var imageButton2: ImageButton
    private lateinit var imageButton3: ImageButton
    private lateinit var imageButton4: ImageButton
    private lateinit var imageButton5: ImageButton
    private lateinit var imageButton6: ImageButton
    private lateinit var imageButton7: ImageButton
    private lateinit var imageButton8: ImageButton
    private lateinit var instructionModal: LinearLayout
    private lateinit var closeModalButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize ImageButtons
        imageButton1 = findViewById(R.id.imageButton1)
        imageButton2 = findViewById(R.id.imageButton2)
        imageButton3 = findViewById(R.id.imageButton3)
        imageButton4 = findViewById(R.id.imageButton4)
        imageButton5 = findViewById(R.id.imageButton5)
        imageButton6 = findViewById(R.id.imageButton6)
        imageButton7 = findViewById(R.id.imageButton7)
        imageButton8 = findViewById(R.id.imageButton8)
        imageView = findViewById(R.id.centerImageView)

        // Initialize modal views
        instructionModal = findViewById(R.id.instruction_modal)
        closeModalButton = findViewById(R.id.close_instruction_btn)

        // You can now use imageView and imageButton variables as needed

        imageButton1.setOnClickListener {
            imageView.setImageResource(R.drawable.fullpinktop)
        }
        imageButton2.setOnClickListener {
            imageView.setImageResource(R.drawable.fullcowminiskirt)
        }
        imageButton3.setOnClickListener {
            imageView.setImageResource(R.drawable.fullshirredfootballbabyredtee)
        }
        imageButton4.setOnClickListener {
            imageView.setImageResource(R.drawable.fullburgundyleathershoes)
        }
        imageButton5.setOnClickListener {
            imageView.setImageResource(R.drawable.fullredjellyshoes)
        }
        imageButton6.setOnClickListener {
            imageView.setImageResource(R.drawable.fullblackholetop)
        }
        imageButton7.setOnClickListener {
            imageView.setImageResource(R.drawable.fullbabydenimskirt)
        }
        imageButton8.setOnClickListener {
            imageView.setImageResource(R.drawable.fullbrownminiskirt)
        }





        class MainActivity : AppCompatActivity() {

            private lateinit var imageButton1: ImageButton
            private lateinit var imageButton2: ImageButton
            private lateinit var imageButton3: ImageButton
            private lateinit var imageButton4: ImageButton
            private lateinit var imageButton5: ImageButton
            private lateinit var imageButton6: ImageButton
            private lateinit var imageButton7: ImageButton
            private lateinit var imageButton8: ImageButton

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                // Initialize ImageButtons
                imageButton1 = findViewById(R.id.imageButton1)
                imageButton2 = findViewById(R.id.imageButton2)
                imageButton3 = findViewById(R.id.imageButton3)
                imageButton4 = findViewById(R.id.imageButton4)
                imageButton5 = findViewById(R.id.imageButton5)
                imageButton6 = findViewById(R.id.imageButton6)
                imageButton7 = findViewById(R.id.imageButton7)
                imageButton8 = findViewById(R.id.imageButton8)

                // Set onClickListeners for all image buttons to launch MainActivity2
                val clickListener = {
                    val intent = Intent(this, MainActivity2::class.java)
                    startActivity(intent)
                }

                imageButton1.setOnClickListener { clickListener() }
                imageButton2.setOnClickListener { clickListener() }
                imageButton3.setOnClickListener { clickListener() }
                imageButton4.setOnClickListener { clickListener() }
                imageButton5.setOnClickListener { clickListener() }
                imageButton6.setOnClickListener { clickListener() }
                imageButton7.setOnClickListener { clickListener() }
                imageButton8.setOnClickListener { clickListener() }
            }
        }}
    }




