package com.ilgiz.coinsapi.presentation.models

import com.google.gson.annotations.SerializedName

data class CoinsModel(

    @SerializedName("id")
    val id: String,

    @SerializedName("name")
    val name: String,

)