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
        val messageInput = findViewById<EditText>(R.id.messageInput)
        val adressInput = findViewById<EditText>(R.id.adressInput)

        emailButton.setOnClickListener{
            val email = adressInput.text.toString()
            val message = messageInput.text.toString()


                val intent = Intent(Intent.ACTION_SEND)
                intent.data = Uri.parse("mailto:")
                intent.type = "text/plain"
                intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
                intent.putExtra(Intent.EXTRA_TEXT, message)
                startActivity(Intent.createChooser(intent, "Send Mail"))





        }


    }
}