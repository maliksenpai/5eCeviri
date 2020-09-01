package com.e.a5eceviri.model.api.response.raceresponse

import com.google.gson.annotations.SerializedName

data class RaceList(
    @SerializedName("name")
    var name: String,
    @SerializedName("size")
    var size:String,
    @SerializedName("speed")
    var speed:Speed,
    @SerializedName("ability")
    var ability: Ability,
    @SerializedName("entries")
    var entries:List<Entries>,
    @SerializedName("darkvision")
    var darkvision:String?,
    @SerializedName("subraces")
    var subraces: List<Subraces>?
)