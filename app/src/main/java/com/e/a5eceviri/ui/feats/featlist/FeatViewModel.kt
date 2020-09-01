package com.e.a5eceviri.ui.feats.featlist

import androidx.lifecycle.MutableLiveData
import com.e.a5eceviri.model.api.response.backgroundresponse.BackgroundList
import com.e.a5eceviri.model.api.response.featresponse.Feat
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.utils.getJsonFromAssets
import com.google.gson.Gson
import java.io.InputStream

class FeatViewModel:BaseViewModel() {

    var list:MutableLiveData<MutableList<String>> = MutableLiveData()

    override fun init() {

    }

    fun listfeats(json:InputStream){
        var featlist:MutableList<String> = arrayListOf()
        var string = getJsonFromAssets().getjson(json)
        var feats: Feat = Gson().fromJson(string, Feat::class.java)
        for(feat in feats.list){
            featlist.add(feat.name)
        }
        list.value=featlist
    }
}