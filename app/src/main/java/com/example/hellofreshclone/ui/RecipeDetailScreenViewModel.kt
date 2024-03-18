package com.example.hellofreshclone.ui

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hellofreshclone.domain.Recipe
import com.example.hellofreshclone.domain.RecipeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class RecipeDetailScreenViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val recipeRepository: RecipeRepository
) : ViewModel() {
    val detailScreenState: StateFlow<Recipe?> =
        savedStateHandle.getStateFlow<String?>(key = "recipeId", initialValue = null)
            .map { recipeId ->
                if (recipeId != null) {
                    recipeRepository.getRecipes().find { it.id.toString() == recipeId }
                } else null
            }.stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5_000),
                initialValue = null,
            )
}