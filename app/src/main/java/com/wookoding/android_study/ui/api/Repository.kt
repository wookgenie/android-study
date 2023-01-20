package com.wookoding.android_study.ui.api

import retrofit2.Response

/**
 * doc 주석
 * @author wookjin
 * @since 2023/01/18
 **/
class Repository {
    suspend fun requestTEST(reqData: REQ_TEST001): Response<RES_TEST001>? {
        return ApiService.getApi()?.REQ_TEST001(reqData = reqData)
    }
}