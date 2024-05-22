package com.example.dietsapp.features.Home

import com.example.dietsapp.data.model.response.ResultData

data class HomeUiState(
    val listRecipes: ArrayList<ResultData> = ArrayList()
)