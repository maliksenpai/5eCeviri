package com.e.a5eceviri.ui.classes.classdetail

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.e.a5eceviri.model.api.response.clasresponse.ClasList
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.utils.getJsonFromAssets
import com.google.gson.Gson
import java.io.InputStream
import java.lang.StringBuilder

class ClassDetailViewModel:BaseViewModel() {
    var text:MutableLiveData<MutableList<String>> = MutableLiveData()

    override fun init() {

    }

    fun getdetail(name:String,json:InputStream){

        var string = getJsonFromAssets().getjson(json)
        var classes : ClasList = Gson().fromJson(string, ClasList::class.java)
        for (clas in classes.claslist){
            if(clas.name==name){
                var classdetail:MutableList<String> = arrayListOf()
                var stringproficiency = StringBuilder()
                var stringarmor = StringBuilder()
                var stringweapons = StringBuilder()
                var stringskills = StringBuilder()
                var stringstartingitems = StringBuilder()
                var stringfeatures = StringBuilder()
                var stringtable = StringBuilder()
                var temp = ""
                var temp2 = 1
                var classname = clas.name
                classdetail.add(classname)
                var proficiency = clas.proficiency
                for(prof in proficiency){
                    stringproficiency.append(prof+"-")
                }
                var armors = clas.startingProficiencies.armor
                for(armor in armors){
                    stringarmor.append(armor+",")
                }
                var weapons = clas.startingProficiencies.weapons
                for(weapon in weapons){
                    stringweapons.append(weapon+",")
                }
                var skills = clas.startingProficiencies.skills.from
                var skillschoose = clas.startingProficiencies.skills.choose
                for(skill in skills){
                    stringskills.append(skill+",")
                }
                classdetail.add("Kurtulma Zarı:"+stringproficiency.toString().dropLast(1)+"\nZırhlar:"+stringarmor.toString().dropLast(1)+"\nSilahlar:"+stringweapons.toString().dropLast(1)+"\nYetenekler(Bunlardan "+skillschoose+" tane seç):"+stringskills.toString().dropLast(1)+"\n")
                var startingitems = clas.startingEquipment.default
                for(startingitem in startingitems){
                    stringstartingitems.append(startingitem+"\n")
                }
                var startinggold = clas.startingEquipment.goldAlternative
                classdetail.add("Seçenekler:\n"+stringstartingitems.toString()+"\n"+("Alternatif olarak "+startinggold+"gp ile başlayıp kendi ekipmanını alabilirsin.\n"))
                var features = clas.classFeatures
                for(feature1 in features){
                    for(feature2 in feature1){
                        stringfeatures.append(feature2.name+"\n"+feature2.entries+"\n\n\n")
                    }
                }
                classdetail.add(stringfeatures.toString())
                var tables=clas.classTableGroups
                for(table in tables){
                    var col=StringBuilder()
                    var row=StringBuilder()
                    for(cols in table.colLabels){
                        col.append(cols+"      ")
                    }
                    for(rows1 in table.rows){
                        if(temp2<10){
                            row.append("Seviye "+temp2+" :")
                        }else{
                            row.append("Seviye "+temp2+":")
                        }

                        temp2++
                        for(rows2 in rows1){
                            row.append(rows2+"    ")
                        }
                        row.append("\n")
                    }
                    temp2=1
                    stringtable.append(col.toString()+"\n"+row+"\n\n")
                }
                Log.d("gelen",stringtable.toString())
                classdetail.add(stringtable.toString())
                text.value=classdetail
            }
        }
    }
}