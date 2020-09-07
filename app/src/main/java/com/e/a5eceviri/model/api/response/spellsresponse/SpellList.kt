package com.e.a5eceviri.model.api.response.spellsresponse

import com.google.gson.annotations.SerializedName

data class SpellList(
    @SerializedName("name")
    var name:String,
    @SerializedName("level")
    var level:String,
    @SerializedName("school")
    var school:String,
    @SerializedName("time")
    var time:Time,
    @SerializedName("range")
    var range:Range,
    @SerializedName("components")
    var components:Components,
    @SerializedName("duration")
    var duration: Duration,
    @SerializedName("entries")
    var entries:List<String>,
    @SerializedName("classes")
    var clases:ClasList,
    @SerializedName("entriesHigherLevel")
    var entriesHigherLevel:String?
)