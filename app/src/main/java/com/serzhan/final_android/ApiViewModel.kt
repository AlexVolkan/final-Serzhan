package com.serzhan.final_android

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ApiViewModel : ViewModel() {
    private val apiRepository = ApiRepository()

    private val _apiItems = MutableLiveData<List<ApiItem>>()
    val apiItems: LiveData<List<ApiItem>> get() = _apiItems

    fun fetchPublicApis() {
        viewModelScope.launch {
            val result = apiRepository.getPublicApis()
            _apiItems.value = result
        }
    }
}