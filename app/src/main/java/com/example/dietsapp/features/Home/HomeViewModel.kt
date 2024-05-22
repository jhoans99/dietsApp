package com.example.dietsapp.features.Home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dietsapp.data.DietsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    dietsRepository: DietsRepository
): ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState
    init {
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    listRecipes = dietsRepository.getRecipesInformation() ?: ArrayList()
                )
            }
        }
    }
}