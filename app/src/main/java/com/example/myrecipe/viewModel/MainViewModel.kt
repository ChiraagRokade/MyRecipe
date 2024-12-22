package com.example.myrecipe.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myrecipe.model.Category
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _categoriesState = mutableStateOf(RecipeState())
    val categoriesState: State<RecipeState> = _categoriesState

    private fun fetchCategories(){
        viewModelScope.launch {
        }
    }

    data class RecipeState(
        val isLoading: Boolean = false,
        val list: List<Category> = emptyList(),
        val error: String? = null
    )
}