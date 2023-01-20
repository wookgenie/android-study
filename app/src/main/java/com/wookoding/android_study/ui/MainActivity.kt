package com.wookoding.android_study.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wookoding.android_study.databinding.ActivityMainBinding
import com.wookoding.android_study.ui.api.ApiActivity
import com.wookoding.android_study.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        binding.api.setOnClickListener {
            startActivity(Intent(this, ApiActivity::class.java))
        }
    }
}