package com.wookoding.android_study.ui.api

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wookoding.android_study.databinding.ActivityApiBinding

class ApiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityApiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apiStart.setOnClickListener {

        }
    }

}