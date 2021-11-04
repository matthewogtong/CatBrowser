package com.example.catbrowser.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.catbrowser.model.Breed
import com.example.catbrowser.repo.CatRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CatViewModel : ViewModel() {

    private val _breeds = MutableLiveData<List<Breed>>()
    val breeds: LiveData<List<Breed>> get() = _breeds

    fun getBreeds() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = CatRepo.getBreeds()
            val list = if (response.isSuccessful && !response.body().isNullOrEmpty())
                response.body()
            else listOf("ERROR")
            _breeds.postValue(list!! as List<Breed>?)
        }
    }
}