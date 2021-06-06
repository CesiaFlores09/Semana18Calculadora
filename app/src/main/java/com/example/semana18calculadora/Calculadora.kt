package com.example.semana18calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Calculadora : AppCompatActivity() {
    lateinit var Campo1: EditText
    lateinit var Campo2: EditText
    lateinit var Campo3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        Campo1 = this.findViewById(R.id.edtN1)
        Campo2 = this.findViewById(R.id.edtNu2)
        Campo3 = this.findViewById(R.id.ltxtResultado)

        val btnregresar=findViewById<FloatingActionButton>(R.id.btnRegresar)
        btnregresar.setOnClickListener{
            val menu = Intent(this, MainActivity::class.java)
            startActivity(menu)
        }

    }

    fun suma(view: View) {
        var numero1: String = Campo1.text.toString()
        var numero2: String = Campo2.text.toString()
        var resultado = (numero1.toFloat() + numero2.toFloat())
        Campo3.setText(resultado.toString())

    }

    fun resta(view: View) {
        var numero1: String = Campo1.text.toString()
        var numero2: String = Campo2.text.toString()
        var resultado = (numero1.toFloat() - numero2.toFloat())
        Campo3.setText(resultado.toString())

    }

    fun multipliacion(view: View) {
        var numero1: String = Campo1.text.toString()
        var numero2: String = Campo2.text.toString()
        var resultado = (numero1.toFloat() * numero2.toFloat())
        Campo3.setText(resultado.toString())
    }

    fun divisioncion(view: View) {
        var numero1: String = Campo1.text.toString()
        var numero2: String = Campo2.text.toString()
        var resultado = (numero1.toFloat() /numero2.toFloat())
        Campo3.setText(resultado.toString())


    }
}