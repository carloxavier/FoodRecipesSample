package com.example.hellofreshclone.data

import com.example.hellofreshclone.domain.Recipe
import com.example.hellofreshclone.domain.RecipeRepository
import javax.inject.Inject

private val recipes = listOf(
    Recipe(
        1,
        "Creamy Tomato Pasta",
        "https://images.pexels.com/photos/1279330/pexels-photo-1279330.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
        "A quick and easy pasta dish with a rich tomato sauce",
        "30 mins",
        listOf()
    ),
    Recipe(
        2,
        "Spicy Chicken Tacos",
        "https://images.pexels.com/photos/1279330/pexels-photo-1279330.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
        "Flavorful chicken tacos with a spicy kick",
        "25 mins",
        listOf()
    ),
)

class MockRecipeRepositoryImpl @Inject constructor(): RecipeRepository {
    override suspend fun getRecipes() = recipes
}