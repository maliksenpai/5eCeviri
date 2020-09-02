package com.e.a5eceviri.ui.items.itemdetail

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.e.a5eceviri.model.api.response.itemresponse.Items
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.utils.getJsonFromAssets
import com.google.gson.Gson
import java.io.InputStream
import java.lang.NullPointerException
import java.lang.StringBuilder

class ItemDetailViewModel:BaseViewModel() {

    var list:MutableLiveData<MutableList<String>> = MutableLiveData()

    override fun init() {

    }

    fun getdetail(name:String,json:InputStream){
        Log.d("gelen",name)
        var string = getJsonFromAssets().getjson(json)
        var items : Items = Gson().fromJson(string, Items::class.java)
        for(item in items.list){
            if(item.name==name){
                var itemlist:MutableList<String> = arrayListOf()
                var itemname = item.name
                itemlist.add(itemname)
                var itemrarity = item.rarity
                itemlist.add(itemrarity)
                var stringdesc = StringBuilder()
                if(item.weight==null){
                    NullPointerException()
                }else{
                    stringdesc.append("Ağırlık: "+item.weight+"\n\n")
                }
                if(item.entries==null){
                    NullPointerException()
                }else{
                    for(entry in item.entries!!){
                        stringdesc.append(entry.toString()+"\n\n")
                    }
                }
                itemlist.add(stringdesc.toString())
                list.value=itemlist
            }
        }
    }
}