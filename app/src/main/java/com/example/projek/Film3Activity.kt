package com.example.projek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent
class Film3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.film3activity)

        // Temukan TextView untuk "Kembali"
        val tvKembali: TextView = findViewById(R.id.tvKembali)

        // Atur OnClickListener untuk "Kembali"
        tvKembali.setOnClickListener {
            // Kode untuk kembali ke halaman sebelumnya
            onBackPressed()
        }
    }
}