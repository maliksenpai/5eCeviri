package com.e.a5eceviri.model.api.response.spellsresponse

import com.google.gson.annotations.SerializedName

data class Range(
    @SerializedName("distance")
    var distance:Distance
)