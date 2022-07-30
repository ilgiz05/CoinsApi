package com.ilgiz.coinsapi.data.remote.apiservices

import com.ilgiz.coinsapi.presentation.models.CoinsModel
import retrofit2.http.GET

interface CoinsApiService {

    @GET("coins")
    suspend fun fetchCoins(): List<CoinsModel>
}