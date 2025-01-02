package com.example.myrecipe.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myrecipe.apiservices.reapiService
import com.example.myrecipe.model.Category
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _categoriesState = mutableStateOf(RecipeState())
    val categoriesState: State<RecipeState> = _categoriesState

    init {
        fetchCategories()
    }
    private fun fetchCategories(){

        viewModelScope.launch {
            try{
                val response = reapiService.getCategories()
                _categoriesState.value = _categoriesState.value.copy(
                    list = response.categories,
                    isLoading = false,
                    error = null
                )
            }
            catch(ex: Exception){
                _categoriesState.value = _categoriesState.value.copy(
                    isLoading = false,
                    error = "Error fetching categories: ${ex.message}"
                )
            }
        }
    }

    data class RecipeState(
        val isLoading: Boolean = false,
        val list: List<Category> = emptyList(),
        val error: String? = null
    )
}