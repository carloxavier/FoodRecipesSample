package com.example.hellofreshclone

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hellofreshclone.ui.RecipeDetailScreen
import com.example.hellofreshclone.ui.RecipeFeed

@Composable
fun HelloFreshCloneApp() {
    val navController: NavHostController = rememberNavController()
    NavHost(navController, startDestination = "home") {
        composable("home") {
            RecipeFeed {
                navController.navigate("recipe/$it")
            }
        }
        composable("recipe/{recipeId}") {backStackEntry ->
            RecipeDetailScreen()
        }
    }
}