package com.e.a5eceviri.model.api.response.featresponse

import com.google.gson.annotations.SerializedName

data class FeatList(
    @SerializedName("name")
    var name:String,
    @SerializedName("description")
    var description:List<String>,
    @SerializedName("ability")
    var ability:List<String>?,
    @SerializedName("prerequisite")
    var prerequisite:Prerequisite?
)