
package com.e.a5eceviri.model.api.response.clasresponse;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StartingProficiencies {

    @SerializedName("armor")
    @Expose
    private List<String> armor = null;
    @SerializedName("weapons")
    @Expose
    private List<String> weapons = null;
    @SerializedName("skills")
    @Expose
    private Skills skills;

    public List<String> getArmor() {
        return armor;
    }

    public void setArmor(List<String> armor) {
        this.armor = armor;
    }

    public List<String> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<String> weapons) {
        this.weapons = weapons;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

}
