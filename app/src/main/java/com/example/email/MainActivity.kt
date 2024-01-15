package com.example.email

import android.content.Intent
import android.content.Intent.ACTION_SEND
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailButton = findViewById<Button>(R.id.emailbutton)

        emailButton.setOnClickListener{

            val messageInput = findViewById<EditText>(R.id.messageInput)
            val message = messageInput.text.toString()
            val adressInput = findViewById<EditText>(R.id.adressInput)

            adressInput?.let {
                val adress = Uri.parse(adressInput.text.toString())

                val intent = Intent(ACTION_SEND, adress)
                intent.putExtra(Intent.EXTRA_TEXT, message)
                startActivity(intent)


            }

        }


    }
}