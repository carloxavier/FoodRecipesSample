package com.example.hellofreshclone.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun RecipeFeed(recipeFeedViewModel: RecipeFeedViewModel = hiltViewModel(), onClick: (String) -> Unit, ) {
    val recipesState by recipeFeedViewModel.recipeFeedState.collectAsStateWithLifecycle()
    LazyColumn {
        items(recipesState) {
            RecipeCard(it, onClick = onClick)
        }
    }
}