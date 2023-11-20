package com.example.figmatestui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.figmatestui.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                // Замените фрагмент или откройте активность для "Главной"
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                // Замените фрагмент или откройте активность для "Панели инструментов"
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                // Замените фрагмент или откройте активность для "Уведомлений"
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_settings -> {
                // Замените фрагмент или откройте активность для "Настроек"
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = findViewById(R.id.navigationView)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}