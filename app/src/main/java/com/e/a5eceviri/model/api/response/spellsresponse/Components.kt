package com.e.a5eceviri.model.api.response.spellsresponse

import com.google.gson.annotations.SerializedName

data class Components(
    @SerializedName("v")
    var v:String?,
    @SerializedName("s")
    var s:String?,
    @SerializedName("m")
    var m:String?
)