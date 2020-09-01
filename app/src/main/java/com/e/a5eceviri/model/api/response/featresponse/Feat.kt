package com.e.a5eceviri.model.api.response.featresponse

import com.google.gson.annotations.SerializedName

data class Feat(
    @SerializedName("feat")
    var list:List<FeatList>
)