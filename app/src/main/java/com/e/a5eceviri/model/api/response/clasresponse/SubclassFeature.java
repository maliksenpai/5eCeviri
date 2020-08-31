
package com.e.a5eceviri.model.api.response.clasresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubclassFeature {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("explanation")
    @Expose
    private String explanation;
    @SerializedName("explenation")
    @Expose
    private String explenation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getExplenation() {
        return explenation;
    }

    public void setExplenation(String explenation) {
        this.explenation = explenation;
    }

}
