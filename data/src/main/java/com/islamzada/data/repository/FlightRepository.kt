package com.islamzada.data.repository

import com.islamzada.entities.model.SearchResponse
import com.islamzada.network.api.ApiService
import javax.inject.Inject

interface FlightRepositoryInterface {
    suspend fun getFlights() : SearchResponse?
}

class FlightRepository @Inject constructor(private val apiService : ApiService) : FlightRepositoryInterface {
    override suspend fun getFlights(): SearchResponse? {
        return apiService.getFlights()
    }
}