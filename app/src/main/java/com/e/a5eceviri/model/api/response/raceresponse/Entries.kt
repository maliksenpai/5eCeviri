package com.e.a5eceviri.model.api.response.raceresponse

import com.google.gson.annotations.SerializedName

data class Entries(
    @SerializedName("name")
    var name:String,
    @SerializedName("entries")
    var entries:List<String>
)