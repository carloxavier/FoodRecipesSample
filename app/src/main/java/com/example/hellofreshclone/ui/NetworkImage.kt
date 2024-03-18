package com.example.hellofreshclone.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage

@Composable
fun NetworkImage(imageUrl: String, description: String, modifier: Modifier) {
    AsyncImage(
        model = imageUrl,
        contentDescription = description,
        modifier = modifier
    )
}