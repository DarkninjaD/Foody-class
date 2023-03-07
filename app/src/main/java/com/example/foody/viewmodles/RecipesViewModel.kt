package com.example.foody.viewmodles

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.foody.util.Constants.Companion.API_KEY
import com.example.foody.util.Constants.Companion.QUERY_ADD_RECIPES_INFORMATION
import com.example.foody.util.Constants.Companion.QUERY_APIKEY
import com.example.foody.util.Constants.Companion.QUERY_DIET
import com.example.foody.util.Constants.Companion.QUERY_FILL_INGREDIENTS
import com.example.foody.util.Constants.Companion.QUERY_NUMBER
import com.example.foody.util.Constants.Companion.QUERY_TYPE

class RecipesViewModel(application: Application) : AndroidViewModel(application) {
    fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()

        queries[QUERY_NUMBER] = "10"
        queries[QUERY_APIKEY] = API_KEY
        queries[QUERY_TYPE] = "main course"
        queries[QUERY_DIET] = "gluten free"
        queries[QUERY_ADD_RECIPES_INFORMATION] = "true"
        queries[QUERY_FILL_INGREDIENTS] = "true"

        return queries
    }
}