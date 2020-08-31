
package com.e.a5eceviri.model.api.response.clasresponse;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subclass {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("subclassFeatures")
    @Expose
    private List<SubclassFeature> subclassFeatures = null;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("shortName")
    @Expose
    private String shortName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubclassFeature> getSubclassFeatures() {
        return subclassFeatures;
    }

    public void setSubclassFeatures(List<SubclassFeature> subclassFeatures) {
        this.subclassFeatures = subclassFeatures;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

}
