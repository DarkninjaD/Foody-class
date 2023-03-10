package com.example.foody.util

import androidx.datastore.preferences.preferencesKey
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

        const val DATABASE_NAME = "recipes_database"
        const val RECIPES_TABLE = "recipes_table"

        const val DEFAULT_RECIPES_NUMBER = "10"
        const val DEFAULT_MEAL_TYPE = "main course"
        const val DEFAULT_DIET_TYPE = "gluten free"

        const val PREFERENCES_NAME = "foody_preferences"
        const val SELECTED_MEAL_TYPE = "mealType"
        const val SELECTED_MEAL_TYPE_ID = "mealTypeId"
        const val SELECTED_DIET_TYPE = "dietType"
        const val SELECTED_DIET_TYPE_ID = "dietTypeId"
    }
}