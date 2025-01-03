package com.example.myrecipe.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(
    val id:String,
    val strCategory:String,
    val strCategoryThumb:String,
    val strCategoryDescription:String
):Parcelable

data class CategoriesResponse(val categories: List<Category>)
