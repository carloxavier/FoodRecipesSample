package com.example.hellofreshclone.data

import com.example.hellofreshclone.domain.Recipe
import javax.inject.Inject

class NetworkRecipeDataSourceImpl @Inject constructor(private val recipesApi: RecipesApi) : RecipeDataSource {
    override suspend fun getRecipes(): List<Recipe> = recipesApi.getRecipes()
}