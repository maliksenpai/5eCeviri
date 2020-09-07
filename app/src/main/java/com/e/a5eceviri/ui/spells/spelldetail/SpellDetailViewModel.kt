package com.e.a5eceviri.ui.spells.spelldetail

import androidx.lifecycle.MutableLiveData
import com.e.a5eceviri.model.api.response.spellsresponse.Spell
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.utils.getJsonFromAssets
import com.google.gson.Gson
import java.io.InputStream
import java.lang.NullPointerException
import java.lang.StringBuilder

class SpellDetailViewModel:BaseViewModel() {

    var list:MutableLiveData<MutableList<String>> = MutableLiveData()

    override fun init() {

    }
    fun getdetails(name:String,json:InputStream){
        var spelllist:MutableList<String> = arrayListOf()
        var string = getJsonFromAssets().getjson(json)
        var spells: Spell = Gson().fromJson(string, Spell::class.java)
        for(spell in spells.list){
            if(spell.name==name){
                var spellname = spell.name
                spelllist.add(spellname)
                var spelllevel = spell.level
                spelllist.add(spelllevel)
                var spellschool = getschool(spell.school)
                spelllist.add(spellschool)
                var spelltime = spell.time.number + "  " + spell.time.unit
                spelllist.add(spelltime)
                var spellrange = ""
                //var spellrange = spell.range.distance?.amount+"   "+spell.range.distance.type
                if(spell.range.distance.amount==null){
                    spellrange = spell.range.distance.type
                }else{
                    spellrange = spell.range.distance?.amount+"   "+spell.range.distance.type
                }
                spelllist.add(spellrange)
                var stringcomp = StringBuilder()
                if(spell.components.s==null){
                    NullPointerException()
                }else{
                    stringcomp.append("s,")
                }
                if(spell.components.v!=null){
                    stringcomp.append("v,")
                }
                if(spell.components.m!=null){
                    stringcomp.append(spell.components.m)
                }
                if(stringcomp.toString()[0]==','){
                    spelllist.add(stringcomp.toString().dropLast(1))
                }else{
                    spelllist.add(stringcomp.toString())
                }
                var spelldur = spell.duration.amount + "   " + spell.duration.type
                spelllist.add(spelldur)
                var spelldesc = StringBuilder()
                for(entry in spell.entries){
                    spelldesc.append(entry.toString()+"\n\n")
                }
                if(spell.entriesHigherLevel==null){
                    NullPointerException()
                }else{
                    //spelldesc.append(spell.entriesHigherLevel)
                    spelldesc.append(spell.entriesHigherLevel+"\n")
                }
                spelllist.add(spelldesc.toString())
                list.value=spelllist
            }
        }
    }
    fun getschool(name:String):String{
        return when (name) {
            "C" -> return "Conjuration"
            "N" -> return "Necromancy"
            "V" -> return "Evocation"
            "A" -> return "Abjuration"
            "T" -> return "Transmutation"
            "D" -> return "Divination"
            "E" -> return "Enchantment"
            "I" -> return "Illusion"
            else -> " "
        }
    }
}