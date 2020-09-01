package com.e.a5eceviri.ui.races.racelist

import androidx.lifecycle.MutableLiveData
import com.e.a5eceviri.model.api.response.clasresponse.ClasList
import com.e.a5eceviri.model.api.response.raceresponse.Race
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.utils.getJsonFromAssets
import com.google.gson.Gson
import java.io.InputStream

class RaceViewModel:BaseViewModel() {

    var list:MutableLiveData<MutableList<String>> = MutableLiveData()

    override fun init() {

    }

    fun listrace(json:InputStream){
        var racelist:MutableList<String> = arrayListOf()
        var string = getJsonFromAssets().getjson(json)
        var races : Race = Gson().fromJson(string,
            Race::class.java)
        for(race in races.list){
            racelist.add(race.name)
        }
        list.value=racelist
    }
}