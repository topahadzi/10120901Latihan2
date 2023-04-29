package com.example.a10120901latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton
/**
 * Tanggal Pengerjaan : 30/04/2023
 * NIM : 10120901
 * Nama : Mustapha Hadzi
 * Kelas : IF-10
 * */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<TextView>(R.id.register)
        btn.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
    }
}