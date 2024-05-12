package com.example.hellofreshclone.data

import com.example.hellofreshclone.domain.Recipe
import retrofit2.http.GET

interface RecipesApi {
    @GET(FEED_ENDPOINT)
    suspend fun getRecipes(): List<Recipe>

    companion object {
        const val BASE_URL = "https://www.jsonkeeper.com/"
        const val FEED_ENDPOINT = "b/CZS0"
    }
}