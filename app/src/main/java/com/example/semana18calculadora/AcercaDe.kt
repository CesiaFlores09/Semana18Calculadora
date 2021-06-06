package com.example.semana18calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class AcercaDe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca_de)

        val btnregresar=findViewById<FloatingActionButton>(R.id.btnRegresar1)
        btnregresar.setOnClickListener{
            val menu = Intent(this, MainActivity::class.java)
            startActivity(menu)
        }
    }
}