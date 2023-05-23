package com.serzhan.final_android

import okhttp3.Response
import retrofit2.http.GET

interface ApiService {
    @GET("public-apis")
    suspend fun getPublicApis(): Response<List<ApiItem>>
}