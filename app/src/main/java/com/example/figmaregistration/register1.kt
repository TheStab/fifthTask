package com.example.figmaregistration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText

class register1 : AppCompatActivity() {

    private val emailEdit = findViewById<EditText>(R.id.emailEdit)
    private val passwordEdit = findViewById<EditText>(R.id.passwordEdit)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register1)

        val nextBtnClicker = findViewById<Button>(R.id.nextButton)

        nextBtnClicker.setOnClickListener{
            val intent = Intent(this, register2::class.java)
            startActivity(intent)
        }

    }


    /*private fun registerUser() {
        val email = emailEdit.text.toString().trim()
        val password = passwordEdit.text.toString().trim()

        if (email.isEmpty()){
            emailEdit.error = "Email is required"
            emailEdit.requestFocus()
            return
        }

        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailEdit.error = "Please provide valid email"
            emailEdit.requestFocus()
            return
        }

        if (password.isEmpty()){
            passwordEdit.error = "Password is required"
            passwordEdit.requestFocus()
            return
        }

        if (password.length < 6){
            passwordEdit.error = "Minimum password length should be 6 characters"
            passwordEdit.requestFocus()
            return
        }
    }*/
}