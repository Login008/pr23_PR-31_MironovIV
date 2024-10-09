package com.example.pr23_pr_31_mironoviv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.app.ComponentActivity

class ResultActivity :androidx.activity.ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }
    fun send_result(view: View)
    {
        Toast.makeText(this, "Success", Toast.LENGTH_LONG).show()

    }
}