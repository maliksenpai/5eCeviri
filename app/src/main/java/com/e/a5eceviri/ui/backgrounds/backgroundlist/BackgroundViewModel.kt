package com.e.a5eceviri.ui.backgrounds.backgroundlist

import androidx.lifecycle.MutableLiveData
import com.e.a5eceviri.model.api.response.backgroundresponse.BackgroundList
import com.e.a5eceviri.model.api.response.clasresponse.ClasList
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.utils.getJsonFromAssets
import com.google.gson.Gson
import java.io.InputStream

class BackgroundViewModel :BaseViewModel(){

    var list: MutableLiveData<MutableList<String>> = MutableLiveData()

    override fun init() {

    }
    fun listbackground(json:InputStream){
        var backgroundlist:MutableList<String> = arrayListOf()
        var string = getJsonFromAssets().getjson(json)
        var backgrounds:BackgroundList = Gson().fromJson(string, BackgroundList::class.java)
        for(background in backgrounds.list){
            backgroundlist.add(background.name)
        }
        list.value=backgroundlist
    }
}