package br.com.siazu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAbrirSiteFiap = findViewById<Button>(R.id.btn_abrir_site)
        val btnAbrirActivity = findViewById<Button>(R.id.btn_abrir_activity)

        btnAbrirSiteFiap.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fiap.com.br"))
            startActivity(i)
        }

        btnAbrirActivity.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
    }
}