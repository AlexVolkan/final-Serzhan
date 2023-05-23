package com.serzhan.final_android

class ApiRepository {
    suspend fun getPublicApis(): List<ApiItem>? {
        val response = ApiClient.ApiService.getPublicApis()
        if (response.isSuccessful) {
            return response.body()
        }
        return null
    }
}