package com.islamzada.network.api

import com.islamzada.entities.SearchResponse
import retrofit2.http.GET

interface ApiService {
    @GET("flights")
    suspend fun getFlights() : SearchResponse?
}