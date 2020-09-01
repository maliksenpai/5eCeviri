package com.e.a5eceviri.model.api.response.raceresponse

import com.google.gson.annotations.SerializedName

data class Subraces(
    @SerializedName("name")
    var name:String,
    @SerializedName("darkvision")
    var darkvision:String?,
    @SerializedName("ability")
    var ability: Ability,
    @SerializedName("entries")
    var entries: List<Entries>
)