package com.example.hellofreshclone.domain

interface RecipeRepository {
    suspend fun getRecipes(): List<Recipe>
}