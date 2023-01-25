package com.wookoding.android_study.ui.api

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.wookoding.android_study.databinding.ActivityApiBinding
import kotlinx.coroutines.launch

class ApiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityApiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apiStart.setOnClickListener {
            lifecycleScope.launch {
                val reqTest001 = REQ_TEST001(
                    REQ_TEST001.REQ_REQ_DATA(
                        USER_ID = "",
                        USER_PW = ""
                    )
                )
                val repository = Repository().requestTEST(reqTest001)

                if (repository?.code() == 200) {
                    val text = "repository: " + repository + "\nbody: " + repository.body() + "\nmessage: " + repository.message()
                    binding.tvResData.text = text
                }
            }
        }
    }

}