package com.example.cortevip

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ConfirmacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.confirmar)

        val btnVoltar: ImageView = findViewById<ImageView>(R.id.btn_voltar)
        btnVoltar.setOnClickListener {
            finish()
        }
    }
}