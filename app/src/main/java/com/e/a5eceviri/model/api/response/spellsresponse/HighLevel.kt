package com.e.a5eceviri.model.api.response.spellsresponse

import com.google.gson.annotations.SerializedName

data class HighLevel(
    @SerializedName("entries")
    var entries:List<String>
)