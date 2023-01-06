package com.wookoding.android_study.ui.login

import android.util.Log
import androidx.lifecycle.ViewModel

/**
 * LoginActivity ViewModel
 * @author wookjin
 * @since 2023/01/06
 **/
class LoginViewModel : ViewModel() {

    fun requestLogin(uid: String, upwd: String, isAutoLogin: Boolean) {
        Log.d("LoginViewModel", "uid : $uid upwd : $upwd isAutoLogin : $isAutoLogin")
    }
}