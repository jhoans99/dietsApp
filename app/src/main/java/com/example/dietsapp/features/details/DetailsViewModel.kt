package com.example.dietsapp.features.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch

@HiltViewModel
class DetailsViewModel: ViewModel() {

    fun getDetailsRecipe(id: String) {
        viewModelScope.launch {

        }
    }
}