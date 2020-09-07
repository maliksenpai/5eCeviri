package com.e.a5eceviri.model.api.response.spellsresponse

import com.google.gson.annotations.SerializedName

data class Time(
    @SerializedName("number")
    var number:String,
    @SerializedName("unit")
    var unit:String
)