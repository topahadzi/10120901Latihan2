package com.example.a10120901latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class AlmostThereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_there)
        val btn = findViewById<MaterialButton>(R.id.btnVerify)
        btn.setOnClickListener {
            startActivity(Intent(this,VerifyActivity::class.java))
        }
    }
}