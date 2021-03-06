package com.e.a5eceviri.ui.main

import android.content.Intent
import android.view.View
import com.e.a5eceviri.ui.backgrounds.backgroundlist.BackgroundActivity
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.ui.classes.classlist.ClassActivity
import com.e.a5eceviri.ui.feats.featlist.FeatActivity
import com.e.a5eceviri.ui.items.itemslist.ItemsActivity
import com.e.a5eceviri.ui.races.racelist.RaceActivity
import com.e.a5eceviri.ui.spells.spellfiltre.SpellFiltreActivity

class MainViewModel : BaseViewModel() {
    override fun init() {
        //başlangıç
    }

    fun irklar(v: View){
        var context = v.context
        context.startActivity(Intent(context, RaceActivity::class.java))
    }
    fun sınıflar(v:View){
        var context = v.context
        context.startActivity(Intent(context,
            ClassActivity::class.java))
    }
    fun esyalar(v:View){
        var context = v.context
        context.startActivity(Intent(context, ItemsActivity::class.java))
    }
    fun gecmis(v:View){
        var context = v.context
        context.startActivity(Intent(context,BackgroundActivity::class.java))
    }
    fun huner(v:View){
        var context = v.context
        context.startActivity(Intent(context,FeatActivity::class.java))
    }
    fun buyu(v:View){
        var context = v.context
        context.startActivity(Intent(context,SpellFiltreActivity::class.java))
    }
}