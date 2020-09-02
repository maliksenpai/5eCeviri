package com.e.a5eceviri.model.api.response.itemresponse

import com.google.gson.annotations.SerializedName

data class ItemList(
    @SerializedName("name")
    var name:String,
    @SerializedName("weight")
    var weight:String?,
    @SerializedName("rarity")
    var rarity:String,
    @SerializedName("entries")
    var entries:List<Any>?
)