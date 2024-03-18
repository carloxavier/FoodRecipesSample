package com.example.hellofreshclone.di

import com.example.hellofreshclone.data.MockRecipeRepositoryImpl
import com.example.hellofreshclone.domain.RecipeRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface DataModule {
    @Binds
    fun bindsRepositoty(recipeRepositoryImpl: MockRecipeRepositoryImpl): RecipeRepository
}