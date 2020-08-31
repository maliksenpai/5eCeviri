package com.e.a5eceviri.ui.backgrounds.backgrounddetail

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.e.a5eceviri.model.api.response.backgroundresponse.BackgroundList
import com.e.a5eceviri.model.api.response.clasresponse.ClasList
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.utils.getJsonFromAssets
import com.google.gson.Gson
import java.io.InputStream
import java.lang.StringBuilder

class BackgroundDetailViewModel:BaseViewModel() {

    var list: MutableLiveData<MutableList<String>> = MutableLiveData()

    override fun init() {

    }

    fun getdetail(name:String,json:InputStream){
        var string = getJsonFromAssets().getjson(json)
        var backgrounds : BackgroundList = Gson().fromJson(string, BackgroundList::class.java)
        for(background in backgrounds.list){
            if(background.name==name){
                var backgroundetail:MutableList<String> = arrayListOf()
                var stringprofiency = StringBuilder()
                var stringlanguage = StringBuilder()
                var stringtool = StringBuilder()
                var stringequipment = StringBuilder()
                var stringfeature = StringBuilder()
                var stringdesp = ""
                var stringchacteristic = StringBuilder()
                var stringideal = StringBuilder()
                var stringbods = StringBuilder()
                var stringflaws = StringBuilder()
                var name = background.name
                backgroundetail.add(name)
                for(profiency in background.skillProficiencies){
                    stringprofiency.append(profiency+",")
                }
                backgroundetail.add(stringprofiency.toString().dropLast(1)+"\n")
                for(language in background.language!!){
                    stringlanguage.append(language+",")
                }
                backgroundetail.add(stringlanguage.toString().dropLast(1)+"\n")
                for(tool in background.toolProficiency!!){
                    stringtool.append(tool+",")
                }
                backgroundetail.add(stringtool.toString().dropLast(1)+"\n")
                for(equipment in background.equipment){
                    stringequipment.append(equipment+",")
                }
                backgroundetail.add(stringequipment.toString().dropLast(1)+"\n")
                stringfeature.append(background.featureName+"\n\n")
                for(features in background.feature){
                    stringfeature.append(features+"\n\n")
                }
                backgroundetail.add(stringfeature.toString().dropLast(1)+"\n")
                stringdesp = background.suggestedDescription!!
                stringchacteristic.append("Karakter Özelliği \n\n")
                for(characteristic in background.suggestedCharacteristic!!){
                    stringchacteristic.append(characteristic+"\n\n")
                }
                stringideal.append("İdeal \n\n")
                for(ideal in background.suggestedIdeal!!){
                    stringideal.append(ideal+"\n\n")
                }
                stringbods.append("Bağ\n\n")
                for(bond in background.suggestedBonds!!){
                    stringbods.append(bond+"\n\n")
                }
                stringflaws.append("Kusur\n\n")
                for(flaw in background.suggestedFlaw!!){
                    stringflaws.append(flaw+"\n\n")
                }
                backgroundetail.add(stringdesp+"\n\n"+stringchacteristic.toString()+"\n\n"+stringideal.toString()+"\n\n"+stringbods.toString()+"\n\n"+stringflaws.toString()+"\n\n")
                list.value=backgroundetail
            }
        }
    }

}