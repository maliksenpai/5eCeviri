package com.e.a5eceviri.ui.classes.classlist

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.e.a5eceviri.model.api.response.clasresponse.ClasList
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.utils.getJsonFromAssets
import com.google.gson.Gson
import java.io.InputStream

class ClassViewModel:BaseViewModel() {

    var list:MutableLiveData<MutableList<String>> = MutableLiveData()

    override fun init() {
        Log.d("gelen","oldu")
    }

    fun listclass(json:InputStream){
        var classlist:MutableList<String> = arrayListOf()
        var string = getJsonFromAssets().getjson(json)
        var classes : ClasList = Gson().fromJson(string,
            ClasList::class.java)
        for(clas in classes.claslist){
            classlist.add(clas.name)
        }
        list.value=classlist
    }
}