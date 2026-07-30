package com.example.repasogitadso

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class grupo2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grupo2)

        val etDatoGrupo = findViewById<EditText>(R.id.etDatoGrupo)
        val btnAccionGrupo = findViewById<Button>(R.id.btnAccionGrupo)
        val tvResultadoGrupo = findViewById<TextView>(R.id.tvResultadoGrupo)

        btnAccionGrupo.setOnClickListener {
            val textoIngresado = etDatoGrupo.text.toString()

            if (textoIngresado.isNotEmpty()) {
                tvResultadoGrupo.text = "Texto guardado: $textoIngresado"
            } else {
                tvResultadoGrupo.text = "Por favor escribe algo primero."
            }
        }
    }
}