package com.e.a5eceviri.ui.spells.spellfiltre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.lifecycle.Observer
import com.e.a5eceviri.R
import com.e.a5eceviri.databinding.ActivitySpellFiltreBinding
import com.e.a5eceviri.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_spell_filtre.*

class SpellFiltreActivity : BaseActivity<ActivitySpellFiltreBinding,SpellFiltreViewModel>(SpellFiltreViewModel::class.java) {

    var levels = arrayOf("","0","1","2","3","4","5","6","7","8","9")
    var schools = arrayOf(" ","Conjuration","Necromancy","Evocation","Abjuration","Transmutation","Divination","Enchantment","Illusion")
    var clases = arrayOf("","Büyücü","Sorcerer","Rahip","Druid","Ozan","Kolcu","Paladin","Warlock")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun getLayout(): Int {
        return R.layout.activity_spell_filtre
    }

    override fun init() {
        var leveladapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,levels)
        levelfiltre.adapter = leveladapter
        var schooladapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,schools)
        schoolfiltre.adapter = schooladapter
        var clasadapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,clases)
        classfiltre.adapter = clasadapter
    }

    override fun initviewmodel() {
        binding.modelView=viewModel
    }
}