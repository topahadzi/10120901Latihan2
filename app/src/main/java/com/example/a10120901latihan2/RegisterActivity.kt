package com.example.a10120901latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val btn = findViewById<MaterialButton>(R.id.btnRegister)
        btn.setOnClickListener {
            startActivity(Intent(this,AlmostThereActivity::class.java))
        }
    }
}