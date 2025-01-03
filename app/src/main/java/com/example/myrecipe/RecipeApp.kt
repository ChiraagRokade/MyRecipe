package com.example.myrecipe

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myrecipe.model.Category
import com.example.myrecipe.view.CategoryDetails
import com.example.myrecipe.view.RecipeScreen
import com.example.myrecipe.viewModel.MainViewModel

@Composable
fun RecipeApp(navController: NavHostController) {
    val recipeViewModel: MainViewModel = viewModel()
    val viewState by recipeViewModel.categoriesState

    NavHost(navController = navController, startDestination = Screen.RecipeScreen.route) {
        composable(Screen.RecipeScreen.route) {
            RecipeScreen(viewState = viewState, navigateToDetails = {
                navController.currentBackStackEntry?.savedStateHandle?.set("category", it)
                navController.navigate(Screen.DetailsScreen.route)
            })
        }
        composable(Screen.DetailsScreen.route) {
            val category =
                navController.previousBackStackEntry?.savedStateHandle?.get<Category>("category")
            if (category != null) {
                CategoryDetails(category = category)
            }
        }
    }
}