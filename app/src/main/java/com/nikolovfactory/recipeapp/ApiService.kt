package com.nikolovfactory.recipeapp

import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    suspend fun getCategories(): CategoriеsResponse

}