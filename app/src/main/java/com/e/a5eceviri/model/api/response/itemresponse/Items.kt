package com.e.a5eceviri.model.api.response.itemresponse

import com.google.gson.annotations.SerializedName

data class Items(
    @SerializedName("item")
    var list:List<ItemList>
)