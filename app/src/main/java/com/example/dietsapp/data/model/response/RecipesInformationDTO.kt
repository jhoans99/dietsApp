package com.example.dietsapp.data.model.response

import com.google.gson.annotations.SerializedName

data class RecipesInformationDTO(
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("number")
    val number: Int,
    @SerializedName("results")
    val results: ArrayList<ResultData>
)

data class ResultData(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("imageType")
    val imageType: String
)
