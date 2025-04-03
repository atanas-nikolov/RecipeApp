package com.nikolovfactory.recipeapp

data class Category(val idCategory: String,
                    val strCategory: String,
                    val strCategoryThumb: String,
                    val strCategoryDescription: String
)

data class CategoriеsResponse(val categories: List<Category>)

