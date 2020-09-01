package com.e.a5eceviri.model.api.response.raceresponse

import com.google.gson.annotations.SerializedName

data class Speed(
    @SerializedName("walk")
    var walk:String,
    @SerializedName("fly")
    var fly:String?
)