package com.example.foody.viewmodles

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.foody.util.Constants.Companion.API_KEY
import com.example.foody.util.Constants.Companion.DEFAULT_DIET_TYPE
import com.example.foody.util.Constants.Companion.DEFAULT_MEAL_TYPE
import com.example.foody.util.Constants.Companion.DEFAULT_RECIPES_NUMBER
import com.example.foody.util.Constants.Companion.QUERY_ADD_RECIPES_INFORMATION
import com.example.foody.util.Constants.Companion.QUERY_APIKEY
import com.example.foody.util.Constants.Companion.QUERY_DIET
import com.example.foody.util.Constants.Companion.QUERY_FILL_INGREDIENTS
import com.example.foody.util.Constants.Companion.QUERY_NUMBER
import com.example.foody.util.Constants.Companion.QUERY_TYPE

class RecipesViewModel(application: Application) : AndroidViewModel(application) {
    fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()

        queries[QUERY_NUMBER] = DEFAULT_RECIPES_NUMBER
        queries[QUERY_APIKEY] = API_KEY
        queries[QUERY_TYPE] = DEFAULT_MEAL_TYPE
        queries[QUERY_DIET] = DEFAULT_DIET_TYPE
        queries[QUERY_ADD_RECIPES_INFORMATION] = "true"
        queries[QUERY_FILL_INGREDIENTS] = "true"

        return queries
    }
}