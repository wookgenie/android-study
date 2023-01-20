package com.wookoding.android_study.ui.api

import com.google.gson.annotations.SerializedName

/**
 * doc 주석
 * @author wookjin
 * @since 2023/01/17
 **/
data class RES_TEST001(
    @SerializedName("COMMON_HEAD")
    var COMMON_HEAD: RES_COMMON_HEAD,
    @SerializedName("RESP_DATA")
    var RESP_DATA: RES_RESP_DATA
) {
    data class RES_COMMON_HEAD(
        @SerializedName("MESSAGE")
        var MESSAGE: String,
        @SerializedName("CODE")
        var CODE: String,
        @SerializedName("ERROR")
        var ERROR: Boolean,
        @SerializedName("UUID")
        var UUID: String
    )

    data class RES_RESP_DATA(
        @SerializedName("CLPH_NO")
        var CLPH_NO: String,
        @SerializedName("USER_EMAIL")
        var USER_EMAIL: String,
        @SerializedName("USER_ID")
        var USER_ID: String,
        @SerializedName("USER_NM")
        var USER_NM: String
    )
}
