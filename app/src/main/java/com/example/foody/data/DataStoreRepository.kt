package com.example.foody.data

import android.content.Context
import androidx.datastore.DataStore
import androidx.datastore.preferences.*
import com.example.foody.util.Constants.Companion.DEFAULT_DIET_TYPE
import com.example.foody.util.Constants.Companion.DEFAULT_MEAL_TYPE
import com.example.foody.util.Constants.Companion.PREFERENCES_NAME
import com.example.foody.util.Constants.Companion.SELECTED_DIET_TYPE
import com.example.foody.util.Constants.Companion.SELECTED_DIET_TYPE_ID
import com.example.foody.util.Constants.Companion.SELECTED_MEAL_TYPE
import com.example.foody.util.Constants.Companion.SELECTED_MEAL_TYPE_ID
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject

@ActivityRetainedScoped
class DataStoreRepository @Inject constructor(@ApplicationContext private val context: Context) {

    private object PreferenceKeys {
        val selectedMealType = preferencesKey<String>(SELECTED_MEAL_TYPE)
        val selectedMealTypId = preferencesKey<Int>(SELECTED_MEAL_TYPE_ID)
        val selectedDietType = preferencesKey<String>(SELECTED_DIET_TYPE)
        val selectedDietTypeId = preferencesKey<Int>(SELECTED_DIET_TYPE_ID)
    }

    private val dataStore : DataStore<Preferences> = context.createDataStore(
        name = PREFERENCES_NAME
    )

    suspend fun saveMealAndDietType(mealType: String, mealTypeId: Int, dietType:String, dietTypeId:Int ) {
        dataStore.edit { preferences ->
            preferences[PreferenceKeys.selectedMealType] = mealType
            preferences[PreferenceKeys.selectedMealTypId] = mealTypeId
            preferences[PreferenceKeys.selectedDietType] = dietType
            preferences[PreferenceKeys.selectedDietTypeId] = dietTypeId
        }
    }

    val readMealAndDietType: Flow<MealAndDietType> = dataStore.data
        .catch { exception ->
        if(exception is IOException) {
            emit(emptyPreferences())
        } else {
            throw exception
        }
    }
        .map { preferences ->
            val selectedMealType = preferences[PreferenceKeys.selectedMealType] ?: DEFAULT_MEAL_TYPE
            val selectedMealTypeId = preferences[PreferenceKeys.selectedMealTypId] ?: 0
            val selectedDietType = preferences[PreferenceKeys.selectedDietType] ?: DEFAULT_DIET_TYPE
            val selectedDietTypeId = preferences[PreferenceKeys.selectedDietTypeId] ?: 0
            MealAndDietType(
                selectedMealType,
                selectedMealTypeId,
                selectedDietType,
                selectedDietTypeId
            )
        }

}

data class MealAndDietType(
    val selectedMealType : String,
    val selectedMealTypId : Int,
    val selectedDietType : String,
    val selectedDietTypeId : Int
)