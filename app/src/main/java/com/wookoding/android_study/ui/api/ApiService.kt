package com.wookoding.android_study.ui.api

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * doc 주석
 * @author wookjin
 * @since 2023/01/18
 **/
interface ApiService {

    @POST("")
    suspend fun REQ_TEST001(@Body reqData: REQ_TEST001): Response<RES_TEST001>

    companion object {
        fun getApi(): ApiService? {
            return RetrofitClient.client?.create(ApiService::class.java)
        }
    }
}