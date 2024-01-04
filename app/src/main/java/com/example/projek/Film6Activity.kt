package com.example.projek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent
class Film6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.film6activity)

        // Temukan TextView untuk "Kembali"
        val tvKembali: TextView = findViewById(R.id.tvKembali)

        // Atur OnClickListener untuk "Kembali"
        tvKembali.setOnClickListener {
            // Kode untuk kembali ke halaman sebelumnya
            onBackPressed()
        }

        // Temukan Button "Pesan"
        val btnPesan: Button = findViewById(R.id.btnPesan)

        // Atur OnClickListener untuk "Pesan"
        btnPesan.setOnClickListener {
            // Berpindah ke SimpleCalculatingActivity saat tombol "Pesan" diklik
            val intent = Intent(this@Film6Activity, SimpleCalculatingActivity::class.java)
            startActivity(intent)
        }
    }
}