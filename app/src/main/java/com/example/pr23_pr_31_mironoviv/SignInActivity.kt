package com.example.pr23_pr_31_mironoviv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class SignInActivity : ComponentActivity() {
    private lateinit var login: EditText
    private lateinit var pass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        login = findViewById(R.id.login)
        pass = findViewById(R.id.pass)
    }

    fun next(view: View) {
        if (login.text.toString().isNotEmpty() && pass.text.toString().isNotEmpty()) {
            if (pass.text.length >= 8) {
                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Пароль менее 8 символов", Toast.LENGTH_SHORT).show()
            }
        }
        else {
            Toast.makeText(this, "Заполните оба поля", Toast.LENGTH_SHORT).show()
        }
    }
}