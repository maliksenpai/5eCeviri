
package com.e.a5eceviri.model.api.response.clasresponse;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Deneme {

    @SerializedName("class")
    @Expose
    private List<Clas> _class = null;

    public List<Clas> getClass_() {
        return _class;
    }

    public void setClass_(List<Clas> _class) {
        this._class = _class;
    }

}
