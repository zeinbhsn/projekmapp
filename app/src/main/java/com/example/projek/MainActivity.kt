package com.example.projek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent


class MainActivity : AppCompatActivity() {

    lateinit var btnlogin: Button
    lateinit var etusername : EditText
    lateinit var etpassword : EditText
    lateinit var txtlogin : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnlogin = findViewById(R.id.btn_login)
        etusername = findViewById(R.id.et_username)
        etpassword = findViewById(R.id.et_password)
        txtlogin = findViewById(R.id.txt_login)

        btnlogin.setOnClickListener {

            // Mengambil nilai username dan password dari EditText
            var username = etusername.text.toString()
            var password = etpassword.text.toString()

            // Mencetak username dan password (Anda dapat menyimpannya ke dalam file, database, atau melakukan sesuatu yang lain sesuai kebutuhan)
            println("Username: $username")
            println("Password: $password")

            // Buat Intent untuk berpindah ke halaman selanjutnya (HalamanFilmActivity)
            val intent = Intent(this@MainActivity, HalamanFilmActivity::class.java)


            // Jika Anda ingin membawa data ke halaman selanjutnya, Anda dapat menggunakan putExtra
            // intent.putExtra("key", value)

            // Mulai aktivitas baru
            startActivity(intent)
        }




    }
}