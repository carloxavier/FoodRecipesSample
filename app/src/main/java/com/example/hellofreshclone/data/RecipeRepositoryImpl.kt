package com.example.hellofreshclone.data

import com.example.hellofreshclone.domain.Recipe
import com.example.hellofreshclone.domain.RecipeRepository
import javax.inject.Inject

class RecipeRepositoryImpl @Inject constructor(private val recipeDataSource: RecipeDataSource) :
    RecipeRepository {
    override suspend fun getRecipes(): List<Recipe> = recipeDataSource.getRecipes()
}