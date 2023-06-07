package br.com.siazu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnSair = findViewById<Button>(R.id.btn_sair)

        btnSair.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }


    }
}