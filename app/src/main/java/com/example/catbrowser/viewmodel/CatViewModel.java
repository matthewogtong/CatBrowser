package com.example.catbrowser.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.catbrowser.repo.CatRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CatViewModel : ViewModel() {

private val _cat = MutableLiveData<List<String>>()
        val cat: LiveData<List<String>> get() = _cat

        fun getImages(count: Int) {
        viewModelScope.launch(Dispatchers.IO) {
        val response = ShibeRepo.getImages(count)
        val list = if (response.isSuccessful && !response.body().isNullOrEmpty())
        response.body()
        else listOf("ERROR")
        list?.let { urls -> _cat.postValue(urls) }
        }
        }
        }
