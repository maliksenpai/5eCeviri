package com.e.a5eceviri.model.api.response.clasresponse

import com.google.gson.annotations.SerializedName

data class ClasList(
    @SerializedName("class")
    var claslist:List<Clas>
)