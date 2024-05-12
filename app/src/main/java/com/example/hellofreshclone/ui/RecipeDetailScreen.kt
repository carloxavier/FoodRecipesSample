package com.example.hellofreshclone.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.hellofreshclone.domain.Recipe

@Composable
fun RecipeDetailScreen(
    recipeDetailScreenViewModel: RecipeDetailScreenViewModel = hiltViewModel()
) {
    val recipe by recipeDetailScreenViewModel.detailScreenState.collectAsStateWithLifecycle()
    recipe?.let {
        RecipeDetailView(it)
    }
}

@Composable
private fun RecipeDetailView(recipeValue: Recipe) {
    Column(modifier = Modifier.padding(16.dp)) {
        NetworkImage(
            imageUrl = recipeValue.imageUrl,
            description = recipeValue.title,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(16f / 9f)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = recipeValue.title, style = MaterialTheme.typography.headlineLarge)

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Description", style = MaterialTheme.typography.titleMedium)
        Text(text = recipeValue.description)

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Ingredients", style = MaterialTheme.typography.titleMedium)
        recipeValue.ingredients.forEach { ingredient ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "- ${ingredient.quantity} ${ingredient.name}")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
    }
}
