package com.e.a5eceviri.model.api.response.spellsresponse

import com.google.gson.annotations.SerializedName

data class Spell(
    @SerializedName("spell")
    var list:List<SpellList>
)