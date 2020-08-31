package com.e.a5eceviri.model.api.response.backgroundresponse

import com.google.gson.annotations.SerializedName

data class BackgroundList(
    @SerializedName("backgrounds")
    var list:List<Background>
)