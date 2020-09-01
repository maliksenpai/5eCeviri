package com.e.a5eceviri.ui.feats.featdetail

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.e.a5eceviri.model.api.response.backgroundresponse.BackgroundList
import com.e.a5eceviri.model.api.response.featresponse.Feat
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.utils.getJsonFromAssets
import com.google.gson.Gson
import java.io.InputStream
import java.lang.NullPointerException
import java.lang.StringBuilder

class FeatDetailViewModel:BaseViewModel() {

    var list:MutableLiveData<MutableList<String>> = MutableLiveData()

    override fun init() {

    }

    fun getdetail(name:String,json: InputStream){
        var featlist : MutableList<String> = mutableListOf()
        var string = getJsonFromAssets().getjson(json)
        var feats: Feat = Gson().fromJson(string, Feat::class.java)
        for(feat in feats.list){
            if(feat.name==name){
                var stringdesc = StringBuilder()
                var stringability = StringBuilder()
                var stringpre = StringBuilder()
                var stringname = feat.name
                featlist.add(stringname)
                for(desc in feat.description){
                    stringdesc.append(desc+"\n\n")
                }
                featlist.add(stringdesc.toString()+"\n")
                if(feat.ability==null){
                    NullPointerException()
                    featlist.add(stringability.toString().dropLast(1)+" ")
                }else{
                    for(ability in feat?.ability!!){
                        Log.d("gelen",ability)
                        if(!ability.isNullOrEmpty()){
                            stringability.append(ability+",")
                        }
                    }
                    featlist.add(stringability.toString().dropLast(1))
                }
                if(feat.prerequisite==null){
                    NullPointerException()
                    featlist.add(stringpre.toString()+" ")
                }else{
                    if(feat.prerequisite!!.ability==null){
                        NullPointerException()
                    }else{
                        for(ability in feat.prerequisite!!.ability!!){
                            //stringpre.append(ability?.aki+"  "+ability?.zek+"  "+ability?.kar+"  "+ability?.day+"   "+ability?.cev+"   "+ability?.kuv+"\n")
                            if(!ability.aki.isNullOrEmpty()){
                                stringpre.append("aki:"+ability.aki+"  ")
                            }
                            if(!ability.zek.isNullOrEmpty()){
                                stringpre.append("zek:"+ability.zek+"  ")
                            }
                            if(!ability.kar.isNullOrEmpty()){
                                stringpre.append("kar:"+ability.kar+"  ")
                            }
                            if(!ability.day.isNullOrEmpty()){
                                stringpre.append("day:"+ability.day+"  ")
                            }
                            if(!ability.cev.isNullOrEmpty()){
                                stringpre.append("cev:"+ability.cev+"  ")
                            }
                            if(!ability.kuv.isNullOrEmpty()){
                                stringpre.append("kuv:"+ability.kuv+"  ")
                            }
                        }
                    }
                    if(feat.prerequisite!!.proficiency==null){
                        NullPointerException()
                    }else{
                        for(prof in feat.prerequisite!!.proficiency!!){
                            stringpre.append("zırh:"+prof.zirh+"\n")
                        }
                    }
                    if(feat.prerequisite!!.spellcasting==null){
                        NullPointerException()
                    }else{
                        stringpre.append("büyü yapma:"+feat.prerequisite!!.spellcasting!!)
                    }
                    featlist.add(stringpre.toString()+" ")
                }
                list.value=featlist
            }
        }
    }
}