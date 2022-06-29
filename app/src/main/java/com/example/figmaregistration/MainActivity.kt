package com.example.figmaregistration

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class MainActivity : AppCompatActivity() {

    private var mAuth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAuth = FirebaseAuth.getInstance();

        val logInClicker = findViewById<Button>(R.id.logInButton)
        logInClicker.setOnClickListener{
            val log_in = Intent(this, log_in::class.java)
            startActivity(log_in)
        }

        val register1Clicker = findViewById<Button>(R.id.registerButton)
        register1Clicker.setOnClickListener{
            val register = Intent(this, register1::class.java)
            startActivity(register)
        }

    }
}