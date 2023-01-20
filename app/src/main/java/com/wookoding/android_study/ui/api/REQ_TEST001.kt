package com.wookoding.android_study.ui.api

import com.google.gson.annotations.SerializedName

/**
 * doc 주석
 * @author wookjin
 * @since 2023/01/17
 **/
data class REQ_TEST001(
    @SerializedName("USER_ID")
    var USER_ID: String,
    @SerializedName("USER_PW")
    var USER_PW: String
)
