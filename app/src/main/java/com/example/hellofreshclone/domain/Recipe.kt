package com.example.hellofreshclone.domain

data class Recipe(
    val id: Int,
    val title: String,
    val imageUrl: String,
    val description: String,
    val cookingTime: String,
    val ingredients: List<Ingredient>
)
