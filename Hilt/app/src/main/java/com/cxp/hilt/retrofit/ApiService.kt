package com.cxp.hilt.retrofit

import retrofit2.http.GET

/**
 * <pre>
 *     author : CXP
 *     e-mail : cxpnobug@gmail.com
 *     time   : 2021/01/01
 *     desc   :
 *     version: 1.0
 * </pre>
 */
interface ApiService {
    @GET("api/china")
    suspend fun getProvinces(): List<Province>
}