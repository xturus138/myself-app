package com.example.myself.auth.login

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myself.R
import com.example.myself.auth.register.RegisterActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val signUpButton : TextView = findViewById(R.id.signUp)
        signUpButton.setOnClickListener {
            val moveIntent = Intent(this, RegisterActivity::class.java)
            startActivity(moveIntent)
        }
    }
}