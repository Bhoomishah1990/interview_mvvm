package com.example.myapplication.apis

import com.example.myapplication.models.Movies
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET("entries")
    fun getPopularMovies() : Call<Movies>
}