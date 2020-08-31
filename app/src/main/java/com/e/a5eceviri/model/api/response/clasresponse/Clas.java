
package com.e.a5eceviri.model.api.response.clasresponse;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Clas {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("hd")
    @Expose
    private Hd hd;
    @SerializedName("proficiency")
    @Expose
    private List<String> proficiency = null;
    @SerializedName("classTableGroups")
    @Expose
    private List<ClassTableGroup> classTableGroups = null;
    @SerializedName("startingProficiencies")
    @Expose
    private StartingProficiencies startingProficiencies;
    @SerializedName("startingEquipment")
    @Expose
    private StartingEquipment startingEquipment;
    @SerializedName("classFeatures")
    @Expose
    private List<List<ClassFeature>> classFeatures = null;
    @SerializedName("subclassTitle")
    @Expose
    private String subclassTitle;
    /*@SerializedName("subclasses")
    @Expose
    private List<com.e.a5eceviri.model.api.response.clasresponse.Subclass> subclasses = null;*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Hd getHd() {
        return hd;
    }

    public void setHd(Hd hd) {
        this.hd = hd;
    }

    public List<String> getProficiency() {
        return proficiency;
    }

    public void setProficiency(List<String> proficiency) {
        this.proficiency = proficiency;
    }

    public List<ClassTableGroup> getClassTableGroups() {
        return classTableGroups;
    }

    public void setClassTableGroups(List<ClassTableGroup> classTableGroups) {
        this.classTableGroups = classTableGroups;
    }

    public StartingProficiencies getStartingProficiencies() {
        return startingProficiencies;
    }

    public void setStartingProficiencies(StartingProficiencies startingProficiencies) {
        this.startingProficiencies = startingProficiencies;
    }

    public StartingEquipment getStartingEquipment() {
        return startingEquipment;
    }

    public void setStartingEquipment(StartingEquipment startingEquipment) {
        this.startingEquipment = startingEquipment;
    }

    public List<List<ClassFeature>> getClassFeatures() {
        return classFeatures;
    }

    public void setClassFeatures(List<List<ClassFeature>> classFeatures) {
        this.classFeatures = classFeatures;
    }

    public String getSubclassTitle() {
        return subclassTitle;
    }

    public void setSubclassTitle(String subclassTitle) {
        this.subclassTitle = subclassTitle;
    }
/*
    public List<Subclass> getSubclasses() {
        return subclasses;
    }

    public void setSubclasses(List<Subclass> subclasses) {
        this.subclasses = subclasses;
    }
    */

}
