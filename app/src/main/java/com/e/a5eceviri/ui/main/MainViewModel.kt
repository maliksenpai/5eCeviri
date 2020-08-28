package com.e.a5eceviri.ui.main

import android.content.Intent
import android.view.View
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.ui.classes.ClassActivity
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
        context.startActivity(Intent(context,ClassActivity::class.java))
    }
    fun esyalar(v:View){

    }
    fun gecmis(v:View){

    }
}