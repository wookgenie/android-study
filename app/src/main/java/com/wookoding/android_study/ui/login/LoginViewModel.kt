package com.wookoding.android_study.ui.login

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wookoding.android_study.R

/**
 * LoginActivity ViewModel
 * @author wookjin
 * @since 2023/01/06
 **/
class LoginViewModel : ViewModel() {

    private val _loginForm = MutableLiveData<LoginFormState>()
    val loginFormState: LiveData<LoginFormState> = _loginForm

    fun requestLogin(uid: String, upwd: String, isAutoLogin: Boolean) {
        Log.d("LoginViewModel", "uid : $uid upwd : $upwd isAutoLogin : $isAutoLogin")
    }

    fun loginDataChanged(uid: String, upwd: String) {
        if (uid.isEmpty()) {
            _loginForm.value = LoginFormState(usernameError = R.string.invalid_id)
        }
//        else if (upwd.isEmpty()) {
//            _loginForm.value = LoginFormState(passwordError = R.string.invalid_pwd)
//        }
        else {
            _loginForm.value = LoginFormState(isDataValid = true)
        }
    }
}