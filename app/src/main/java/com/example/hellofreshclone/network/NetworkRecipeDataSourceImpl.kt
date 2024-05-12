package com.example.hellofreshclone.network

import com.example.hellofreshclone.data.RecipeDataSource
import com.example.hellofreshclone.domain.Recipe
import javax.inject.Inject

class NetworkRecipeDataSourceImpl @Inject constructor(private val recipesApi: RecipesApi) : RecipeDataSource {
    override suspend fun getRecipes(): List<Recipe> = recipesApi.getRecipes()
}