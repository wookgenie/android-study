package com.wookoding.android_study.ui.login

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

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
        if (uid.isEmpty() || upwd.isEmpty()) {
            // 에러 메세지를 만들어 변경할 경우 isDataValid = false이 필요없음.
            _loginForm.value = LoginFormState(isDataValid = false)
        } else {
            _loginForm.value = LoginFormState(isDataValid = true)
        }
    }
}