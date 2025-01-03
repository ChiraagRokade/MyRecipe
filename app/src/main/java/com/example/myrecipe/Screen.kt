package com.example.myrecipe

sealed class Screen(val route: String) {
    object RecipeScreen : Screen("recipe_screen")
    object DetailsScreen : Screen("details_screen")
}