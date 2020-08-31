
package com.e.a5eceviri.model.api.response.clasresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClassFeature {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("entries")
    @Expose
    private String entries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEntries() {
        return entries;
    }

    public void setEntries(String entries) {
        this.entries = entries;
    }

}
