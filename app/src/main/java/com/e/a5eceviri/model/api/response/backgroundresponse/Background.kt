package com.e.a5eceviri.model.api.response.backgroundresponse

import com.google.gson.annotations.SerializedName

data class Background(
    @SerializedName("name")
    var name:String,
    @SerializedName("skillProficiencies")
    var skillProficiencies:List<String>,
    @SerializedName("language")
    var language:List<String>?,
    @SerializedName("toolProficiency")
    var toolProficiency:List<String>?,
    @SerializedName("equipment")
    var equipment:List<String>,
    @SerializedName("featureName")
    var featureName:String,
    @SerializedName("feature")
    var feature:List<String>,
    @SerializedName("suggestedDescription")
    var suggestedDescription:String?,
    @SerializedName("suggestedCharacteristic")
    var suggestedCharacteristic:List<String>?,
    @SerializedName("suggestedIdeal")
    var suggestedIdeal:List<String>?,
    @SerializedName("suggestedBonds")
    var suggestedBonds:List<String>?,
    @SerializedName("suggestedFlaw")
    var suggestedFlaw:List<String>?
)