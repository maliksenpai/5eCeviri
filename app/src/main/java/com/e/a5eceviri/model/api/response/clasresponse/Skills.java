
package com.e.a5eceviri.model.api.response.clasresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Skills {

    @SerializedName("choose")
    @Expose
    private int choose;
    @SerializedName("from")
    @Expose
    private List<String> from = null;

    public int getChoose() {
        return choose;
    }

    public void setChoose(int choose) {
        this.choose = choose;
    }

    public List<String> getFrom() {
        return from;
    }

    public void setFrom(List<String> from) {
        this.from = from;
    }

}
