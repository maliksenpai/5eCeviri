package com.e.a5eceviri.ui.races.racedetail

import androidx.lifecycle.MutableLiveData
import com.e.a5eceviri.model.api.response.raceresponse.Race
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.utils.getJsonFromAssets
import com.google.gson.Gson
import java.io.InputStream
import java.lang.NullPointerException
import java.lang.StringBuilder

class RaceDetailViewModel:BaseViewModel() {

    var list:MutableLiveData<MutableList<String>> = MutableLiveData()

    override fun init() {

    }
    fun getdetail(name:String,json:InputStream){
        var string = getJsonFromAssets().getjson(json)
        var races : Race = Gson().fromJson(string,Race::class.java)
        for(race in races.list){
            if(name==race.name){
                var racedetail:MutableList<String> = mutableListOf()
                var stringname = ""
                var stringsize = ""
                var stringspeed = StringBuilder()
                var stringabi = StringBuilder()
                var stringdesc = StringBuilder()
                var stringsub = StringBuilder()
                stringname = race.name
                racedetail.add(stringname)
                stringsize = race.size
                racedetail.add(stringsize)
                stringspeed.append("Yürüme hızı:"+race.speed.walk+"\n")
                if(race.speed.fly==null){
                    NullPointerException()
                }else{
                    stringspeed.append("Uçma hızı:"+race.speed.fly)
                }
                racedetail.add(stringspeed.toString())
                var ability = race.ability
                if(!ability.aki.isNullOrEmpty()){
                    stringabi.append("aki +"+ability.aki+"  ")
                }
                if(!ability.zek.isNullOrEmpty()){
                    stringabi.append("zek +"+ability.zek+"  ")
                }
                if(!ability.kar.isNullOrEmpty()){
                    stringabi.append("kar +"+ability.kar+"  ")
                }
                if(!ability.day.isNullOrEmpty()){
                    stringabi.append("day +"+ability.day+"  ")
                }
                if(!ability.cev.isNullOrEmpty()){
                    stringabi.append("cev +"+ability.cev+"  ")
                }
                if(!ability.kuv.isNullOrEmpty()){
                    stringabi.append("kuv +"+ability.kuv+"  ")
                }
                racedetail.add(stringabi.toString())
                if(!race.darkvision.isNullOrEmpty()){
                    stringdesc.append("Karanlık Görüş:"+race.darkvision+"\n")
                }
                for(entries in race.entries){
                    stringdesc.append(entries.name+"\n\n"+entries.entries+"\n\n\n")
                }
                racedetail.add(stringdesc.toString())
                if(race.subraces==null){
                    NullPointerException()
                    racedetail.add("Alt ırk yok")
                }else{
                    for(subraces in race.subraces!!){
                        var entries = StringBuilder()
                        for(entry in subraces.entries){
                            entries.append(entry.name+"\n\n"+entry.entries+"\n\n\n")
                        }
                        stringsub.append("İsim:"+subraces.name+"\n\nÖzellikler:"+entries.toString()+"\n\n\n")
                    }
                    racedetail.add(stringsub.toString())
                }
                list.value=racedetail
            }
        }
    }
}