package com.wookoding.android_study.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.wookoding.android_study.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val idEdit = binding.etId
        val pwdEdit = binding.etPwd
        val btnLogin = binding.btnLogin
        val checkBox = binding.chkAutoLogin

        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        btnLogin.setOnClickListener {
            loginViewModel.requestLogin(idEdit.text.toString(), pwdEdit.text.toString(), checkBox.isChecked)
        }
    }
}