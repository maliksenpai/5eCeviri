package com.e.a5eceviri.model.api.response.spellsresponse

import com.google.gson.annotations.SerializedName

data class Duration(
    @SerializedName("type")
    var type:String,
    @SerializedName("amount")
    var amount:String
)