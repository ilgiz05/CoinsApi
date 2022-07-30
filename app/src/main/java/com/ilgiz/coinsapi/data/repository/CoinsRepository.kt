package com.ilgiz.coinsapi.data.repository

import androidx.lifecycle.liveData

import com.ilgiz.coinsapi.data.remote.apiservices.CoinsApiService
import com.ilgiz.coinsapi.tools.Either
import kotlinx.coroutines.Dispatchers
import java.io.IOException
import javax.inject.Inject

class CoinsRepository @Inject constructor(private val apiService: CoinsApiService) {

    fun fetchCoins() = liveData (Dispatchers.IO) {
        try {
            emit(Either.Right(apiService.fetchCoins()))
        } catch (ioException: IOException) {
            emit(Either.Left(ioException.localizedMessage))
        }
    }
}