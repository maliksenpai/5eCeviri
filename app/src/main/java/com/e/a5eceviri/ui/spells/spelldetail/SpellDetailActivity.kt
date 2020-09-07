package com.e.a5eceviri.ui.spells.spelldetail

import android.os.Bundle
import androidx.lifecycle.Observer
import com.e.a5eceviri.R
import com.e.a5eceviri.databinding.ActivitySpellDetailBinding
import com.e.a5eceviri.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_spell_detail.*

class SpellDetailActivity : BaseActivity<ActivitySpellDetailBinding,SpellDetailViewModel>(SpellDetailViewModel::class.java){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun getLayout(): Int {
        return R.layout.activity_spell_detail
    }

    override fun init() {

    }

    override fun initviewmodel() {
        binding.modelView=viewModel
        var observer = Observer<MutableList<String>>{
            spellnametext.setText(it[0])
            spellleveltext.setText(it[1])
            spellschooltext.setText(it[2])
            spelltimetext.setText(it[3])
            spellrangetext.setText(it[4])
            spellcomptext.setText(it[5])
            spelldurtext.setText(it[6])
            spelldesctext.setText(it[7])
        }
        viewModel.list.observe(this,observer)
        viewModel.getdetails(intent.getStringExtra("name"),assets.open("spells.json"))
    }
}