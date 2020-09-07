package com.e.a5eceviri.ui.spells.spellfiltre

import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.AdapterView
import androidx.lifecycle.MutableLiveData
import com.e.a5eceviri.ui.base.BaseViewModel
import com.e.a5eceviri.ui.spells.spelllist.SpellActivity


class SpellFiltreViewModel:BaseViewModel() {


    var level:MutableLiveData<String> = MutableLiveData()
    var school:MutableLiveData<String> = MutableLiveData()
    var clas:MutableLiveData<String> = MutableLiveData()
    var name:MutableLiveData<String> = MutableLiveData()

    override fun init() {

    }


    fun levelonSelectItem(
        parent: AdapterView<*>?,
        view: View?,
        pos: Int,
        id: Long
    ) {
        Log.d("gelen",parent?.selectedItem.toString())
        level.value = parent?.selectedItem.toString()
    }
    fun schoolonSelectItem(
        parent: AdapterView<*>?,
        view: View?,
        pos: Int,
        id: Long
    ) {
        school.value = parent?.selectedItem.toString()
    }
    fun classonSelectItem(
        parent: AdapterView<*>?,
        view: View?,
        pos: Int,
        id: Long
    ) {
        clas.value = parent?.selectedItem.toString()
    }
    fun button(v:View){
        var context = v.context
        var intent = Intent(context,SpellActivity::class.java)
        intent.putExtra("name",name.value)
        intent.putExtra("school",school.value)
        intent.putExtra("level",level.value)
        intent.putExtra("clas",clas.value)
        context.startActivity(intent)
    }
}