
package com.e.a5eceviri.model.api.response.clasresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClassTableGroup {

    @SerializedName("colLabels")
    @Expose
    private List<String> colLabels = null;
    @SerializedName("rows")
    @Expose
    private List<List<String>> rows = null;

    public List<String> getColLabels() {
        return colLabels;
    }

    public void setColLabels(List<String> colLabels) {
        this.colLabels = colLabels;
    }

    public List<List<String>> getRows() {
        return rows;
    }

    public void setRows(List<List<String>> rows) {
        this.rows = rows;
    }

}
