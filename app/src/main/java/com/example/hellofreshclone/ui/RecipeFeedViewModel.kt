package com.example.hellofreshclone.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hellofreshclone.domain.Recipe
import com.example.hellofreshclone.domain.RecipeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipeFeedViewModel @Inject constructor(
    private val repository: RecipeRepository
): ViewModel() {
    private val _recipeFeedState: MutableStateFlow<List<Recipe>> = MutableStateFlow(emptyList())
    val recipeFeedState: StateFlow<List<Recipe>> = _recipeFeedState.asStateFlow()
    init {
        viewModelScope.launch {
            _recipeFeedState.value = repository.getRecipes()
        }
    }
}