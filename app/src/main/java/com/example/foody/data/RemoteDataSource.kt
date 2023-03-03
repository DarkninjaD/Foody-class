package com.example.foody.data

import com.example.foody.data.network.FoodRecipesApi
import com.example.foody.modals.FoodRecipes
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {
    suspend fun getRecipes(qualifier: Map<String, String>) : Response<FoodRecipes> {
        return foodRecipesApi.getRecipes(qualifier)
    }
}