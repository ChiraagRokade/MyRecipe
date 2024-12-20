package com.example.myrecipe.model

data class Category(
    val id:String,
    val strCategory:String,
    val strCategoryThumb:String,
    val strCategoryDescription:String
)

data class CategoriesResponse(val categories: List<Category>)
