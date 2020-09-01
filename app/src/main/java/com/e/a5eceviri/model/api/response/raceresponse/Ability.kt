package com.e.a5eceviri.model.api.response.raceresponse

import com.google.gson.annotations.SerializedName

data class Ability(
    @SerializedName("çev")
    var cev:String?,
    @SerializedName("akı")
    var aki:String?,
    @SerializedName("kuv")
    var kuv:String?,
    @SerializedName("kar")
    var kar:String?,
    @SerializedName("day")
    var day:String?,
    @SerializedName("zek")
    var zek:String?
)