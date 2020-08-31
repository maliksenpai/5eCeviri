
package com.e.a5eceviri.model.api.response.clasresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StartingEquipment {

    @SerializedName("additionalFromBackground")
    @Expose
    private boolean additionalFromBackground;
    @SerializedName("default")
    @Expose
    private List<String> _default = null;
    @SerializedName("goldAlternative")
    @Expose
    private String goldAlternative;

    public boolean isAdditionalFromBackground() {
        return additionalFromBackground;
    }

    public void setAdditionalFromBackground(boolean additionalFromBackground) {
        this.additionalFromBackground = additionalFromBackground;
    }

    public List<String> getDefault() {
        return _default;
    }

    public void setDefault(List<String> _default) {
        this._default = _default;
    }

    public String getGoldAlternative() {
        return goldAlternative;
    }

    public void setGoldAlternative(String goldAlternative) {
        this.goldAlternative = goldAlternative;
    }

}
