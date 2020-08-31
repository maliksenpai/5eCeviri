
package com.e.a5eceviri.model.api.response.clasresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hd {

    @SerializedName("number")
    @Expose
    private int number;
    @SerializedName("faces")
    @Expose
    private int faces;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFaces() {
        return faces;
    }

    public void setFaces(int faces) {
        this.faces = faces;
    }

}
