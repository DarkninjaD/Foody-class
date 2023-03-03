package com.example.foody.util

import com.example.foody.BuildConfig

class Constants {
    companion object {
        const val API_KEY = BuildConfig.API_KEY
        const val BASE_URL = "https://api.spoonacular.com"

        const val QUERY_NUMBER = "number"
        const val QUERY_APIKEY = "apiKey"
        const val QUERY_TYPE = "type"
        const val QUERY_DIET = "diet"
        const val QUERY_ADD_RECIPES_INFORMATION = "addRecipeInformation"
        const val QUERY_FILL_INGREDIENTS = "fillIngredients"
    }
}