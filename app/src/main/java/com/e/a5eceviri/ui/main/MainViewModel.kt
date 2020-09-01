package com.e.a5eceviri.ui.main

import android.content.Intent
import android.util.Log
import android.view.View
import com.e.a5eceviri.ui.backgrounds.backgroundlist.BackgroundActivity
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.ui.classes.classlist.ClassActivity
import com.e.a5eceviri.ui.feats.featlist.FeatActivity
import com.e.a5eceviri.ui.races.RaceActivity

class MainViewModel : BaseViewModel() {
    override fun init() {
        //başlangıç
    }

    fun irklar(v: View){
        var context = v.context
        context.startActivity(Intent(context,RaceActivity::class.java))
    }
    fun sınıflar(v:View){
        var context = v.context
        context.startActivity(Intent(context,
            ClassActivity::class.java))
    }
    fun esyalar(v:View){

    }
    fun gecmis(v:View){
        var context = v.context
        context.startActivity(Intent(context,BackgroundActivity::class.java))
    }
    fun huner(v:View){
        var context = v.context
        context.startActivity(Intent(context,FeatActivity::class.java))
    }
}