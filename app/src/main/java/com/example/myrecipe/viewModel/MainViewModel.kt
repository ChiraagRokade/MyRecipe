package com.example.myrecipe.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.myrecipe.model.Category

class MainViewModel : ViewModel() {
    private val _categoriesState = mutableStateOf(RecipeState())
    val categoriesState: State<RecipeState> = _categoriesState

    data class RecipeState(
        val isLoading: Boolean = false,
        val list: List<Category> = emptyList(),
        val error: String? = null
    )
}