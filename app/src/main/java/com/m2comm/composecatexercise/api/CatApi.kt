package com.m2comm.composecatexercise.api

import com.m2comm.composecatexercise.model.ApiCat
import retrofit2.Response
import retrofit2.http.GET

interface CatApi {
    @GET("v1/images/search?size=med&mime_types=jpg&format=json&has_breeds=true&page=0&limit=20")
    suspend fun getCats():Response<List<ApiCat>>

}