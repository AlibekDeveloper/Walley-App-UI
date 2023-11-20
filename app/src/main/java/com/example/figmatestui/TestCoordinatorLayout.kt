package com.example.figmatestui

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.figmatestui.databinding.ActivityTestCoordinatorLayoutBinding

class TestCoordinatorLayout : AppCompatActivity() {
    private lateinit var binding: ActivityTestCoordinatorLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestCoordinatorLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupUI()
    }

    private fun setupUI() {
        val eclipseView = binding.eclipseView
        val animationTrigger = binding.animationTrigger

// Animatsiyani boshlash
        val animatorSet = AnimatorSet()
        val scaleXAnimator =
            ObjectAnimator.ofFloat(eclipseView, "scaleX", 0f, 1f)
        val scaleYAnimator =
            ObjectAnimator.ofFloat(eclipseView, "scaleY", 0f, 1f)

        animatorSet.playTogether(scaleXAnimator, scaleYAnimator)
        animatorSet.duration = 1000 // Animatsiya davri

// Animatsiyani boshlash uchun tizimga so'rov yuborish
        animationTrigger.postDelayed({
            animatorSet.start()
        }, 500)
    }
}