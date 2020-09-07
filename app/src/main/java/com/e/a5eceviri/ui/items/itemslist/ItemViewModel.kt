package com.e.a5eceviri.ui.items.itemslist

import android.content.ClipData
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.e.a5eceviri.model.api.response.clasresponse.ClasList
import com.e.a5eceviri.model.api.response.itemresponse.Items
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.utils.getJsonFromAssets
import com.google.gson.Gson
import java.io.InputStream
import java.lang.NullPointerException

class ItemViewModel: BaseViewModel() {

    var string:MutableLiveData<String> = MutableLiveData()
    var list:MutableLiveData<MutableList<String>> = MutableLiveData()

    override fun init() {

    }

    fun listall(json:InputStream){
        var itemlist:MutableList<String> = arrayListOf()
        var string = getJsonFromAssets().getjson(json)
        var items : Items = Gson().fromJson(string, Items::class.java)
        for(clas in items.list){
            itemlist.add(clas.name)
        }
        list.value=itemlist
    }

    fun listspefic(item:String,json:InputStream){
        var itemlist:MutableList<String> = arrayListOf()
        var string = getJsonFromAssets().getjson(json)
        var items : Items = Gson().fromJson(string, Items::class.java)
        for(clas in items.list){
            if(clas.name.contains(item,ignoreCase = true)){
                itemlist.add(clas.name)
            }
        }
        list.value=itemlist
    }
}