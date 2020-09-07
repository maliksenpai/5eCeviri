package com.e.a5eceviri.model.api.response.spellsresponse

import com.google.gson.annotations.SerializedName

data class ClasList(
    @SerializedName("fromClassList")
    var clas:List<Clas>
)