package com.example.dietsapp.data

import com.example.dietsapp.data.model.response.ResultData
import javax.inject.Inject

class DietsRepository @Inject constructor(
    private val dietsApiService: DietsApiService
) {

    suspend fun getRecipesInformation(): ArrayList<ResultData>? {
        return dietsApiService.getRecipesInformation().body()?.results
    }
}