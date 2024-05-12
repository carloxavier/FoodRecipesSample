package com.example.hellofreshclone.data

import com.example.hellofreshclone.domain.Recipe

interface RecipeDataSource {
    suspend fun getRecipes(): List<Recipe>
}