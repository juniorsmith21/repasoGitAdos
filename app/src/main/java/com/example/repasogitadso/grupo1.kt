package com.example.repasogitadso

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.repasogitadso.databinding.ActivityGrupo1Binding

class grupo1 : AppCompatActivity() {

    private lateinit var binding: ActivityGrupo1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGrupo1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAnimarr.setOnClickListener {

            val animacion =
                AnimationUtils.loadAnimation(this, R.anim.rotar)

            binding.imgLogo.startAnimation(animacion)
        }
    }
}