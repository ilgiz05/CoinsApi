package com.ilgiz.coinsapi.di

import com.ilgiz.coinsapi.data.remote.apiservices.NetWorkClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetWorkClient {

    @Singleton
    @Provides
    fun provideCoinsApiService(netWorkClient: NetWorkClient) =
        netWorkClient.provideCoinsApiService()
} 