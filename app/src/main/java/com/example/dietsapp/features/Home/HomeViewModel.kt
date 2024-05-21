package com.example.dietsapp.features.Home

import androidx.lifecycle.ViewModel
import com.example.dietsapp.data.DietsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    dietsRepository: DietsRepository
): ViewModel() {

    init {
        dietsRepository.getRecipesInformation()
    }

}