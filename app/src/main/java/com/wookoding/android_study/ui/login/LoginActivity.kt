package com.wookoding.android_study.ui.login

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
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

        loginViewModel.loginFormState.observe(this@LoginActivity, Observer {
            val loginState = it ?: return@Observer

            // disable login button unless both username / password is valid
            btnLogin.isEnabled = loginState.isDataValid

            if (loginState.usernameError != null) {
                idEdit.error = getString(loginState.usernameError)
            }
            if (loginState.passwordError != null) {
                pwdEdit.error = getString(loginState.passwordError)
            }
        })

        idEdit.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
                loginViewModel.loginDataChanged(
                    idEdit.text.toString(),
                    pwdEdit.text.toString()
                )
            }

        })

        btnLogin.setOnClickListener {
            loginViewModel.requestLogin(idEdit.text.toString(), pwdEdit.text.toString(), checkBox.isChecked)
        }
    }
}