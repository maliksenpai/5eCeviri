package com.e.a5eceviri.model.api.response.featresponse

import com.google.gson.annotations.SerializedName

data class Prerequisite(
    @SerializedName("proficiency")
    var proficiency:List<Armors>?,
    @SerializedName("ability")
    var ability:List<Ability>?,
    @SerializedName("spellcasting")
    var spellcasting:String?
)