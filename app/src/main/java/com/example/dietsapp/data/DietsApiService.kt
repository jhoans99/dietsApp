package com.example.dietsapp.data

import com.example.dietsapp.data.model.response.RecipesInformationDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface DietsApiService {

    @GET("recipes/complexSearch")
    fun getRecipesInformation(
        @Query("apiKey") apiKey: String = "1546be6d60b141b59478bd7b0825d4be"
    ): Response<RecipesInformationDTO>
}

