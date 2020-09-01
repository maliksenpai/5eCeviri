package com.e.a5eceviri.model.api.response.featresponse

import com.google.gson.annotations.SerializedName

data class Ability(
    @SerializedName("kar")
    var kar:String?,
    @SerializedName("çev")
    var cev:String?,
    @SerializedName("kuv")
    var kuv:String?,
    @SerializedName("zek")
    var zek:String?,
    @SerializedName("akı")
    var aki:String?,
    @SerializedName("day")
    var day:String?
)