package com.e.a5eceviri.model.api.response.raceresponse

import com.google.gson.annotations.SerializedName

data class Race(
    @SerializedName("race")
    var list:List<RaceList>
)