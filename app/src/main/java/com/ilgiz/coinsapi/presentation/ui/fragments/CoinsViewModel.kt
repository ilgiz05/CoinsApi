package com.ilgiz.coinsapi.presentation.ui.fragments

import com.ilgiz.coinsapi.presentation.base.BaseViewModel

import com.ilgiz.coinsapi.data.repository.CoinsRepository

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CoinsViewModel @Inject constructor(private val repository: CoinsRepository) :
    BaseViewModel(){

    fun fetchCoins() = repository.fetchCoins()
}