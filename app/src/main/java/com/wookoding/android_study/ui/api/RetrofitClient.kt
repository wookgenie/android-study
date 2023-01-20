package com.wookoding.android_study.ui.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * doc 주석
 * @author wookjin
 * @since 2023/01/18
 **/
object RetrofitClient {

    var mRetrofit: Retrofit? = null

    val client: Retrofit?
        get() {
            if (mRetrofit == null) {
                mRetrofit = Retrofit.Builder()
                    .baseUrl("")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return mRetrofit
        }
}