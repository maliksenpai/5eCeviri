package com.e.a5eceviri.ui.spells.spelllist

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.e.a5eceviri.model.api.response.featresponse.Feat
import com.e.a5eceviri.model.api.response.spellsresponse.Spell
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.utils.getJsonFromAssets
import com.google.gson.Gson
import java.io.InputStream

class SpellViewModel:BaseViewModel() {

    var list:MutableLiveData<MutableList<String>> = MutableLiveData()

    override fun init() {

    }

    fun getspells(clas:String,name:String,school:String,level:String,json:InputStream){
        var spelllist:MutableList<String> = arrayListOf()
        var string = getJsonFromAssets().getjson(json)
        var schoolchar :Char?= ' '
        if(school=="Evocation"){
            schoolchar='V'
        }else if(school==" "){
            schoolchar=' '
        }
        else{
            schoolchar=school[0]
        }
        var spells: Spell = Gson().fromJson(string, Spell::class.java)
        for(spell in spells.list){
            if(spell.name.contains(name.capitalize(),ignoreCase = true)){
                if(schoolchar==' '){
                    if(spell.level.contains(level)){
                        for(listclas in spell.clases.clas){
                            if(listclas.name.contains(clas,ignoreCase = true)){
                                spelllist.add(spell.name)
                            }
                        }
                    }
                }else{
                    if(spell.school==schoolchar.toString()){
                        if(spell.level.contains(level)){
                            for(listclas in spell.clases.clas){
                                if(listclas.name.contains(clas,ignoreCase = true)){
                                    spelllist.add(spell.name)
                                }
                            }
                        }
                    }
                }
            }
        }
        list.value=spelllist
    }

}