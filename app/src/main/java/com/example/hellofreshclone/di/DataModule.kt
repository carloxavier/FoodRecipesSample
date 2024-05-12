package com.example.hellofreshclone.di

import com.example.hellofreshclone.data.RecipeRepositoryImpl
import com.example.hellofreshclone.data.RecipeDataSource
import com.example.hellofreshclone.domain.RecipeRepository
import com.example.hellofreshclone.network.NetworkRecipeDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface DataModule {
    @Binds
    fun bindsRepository(recipeRepositoryImpl: RecipeRepositoryImpl): RecipeRepository

    @Binds
    fun bindsDataSource(recipeDataSourceImpl: NetworkRecipeDataSourceImpl): RecipeDataSource
}