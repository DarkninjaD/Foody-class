package com.example.foody.modals


import com.google.gson.annotations.SerializedName

data class FoodRecipes(
    @SerializedName("results")
    val results: List<Result>,
)