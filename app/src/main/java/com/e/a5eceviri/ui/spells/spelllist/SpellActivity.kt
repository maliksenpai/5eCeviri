package com.e.a5eceviri.ui.spells.spelllist

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.e.a5eceviri.R
import com.e.a5eceviri.databinding.ActivitySpellBinding
import com.e.a5eceviri.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_spell.*

class SpellActivity : BaseActivity<ActivitySpellBinding,SpellViewModel>(SpellViewModel::class.java) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun getLayout(): Int {
        return R.layout.activity_spell
    }

    override fun init() {

    }

    override fun initviewmodel() {
        binding.modelView=viewModel
        var observer = Observer<MutableList<String>>{
            var recyclerView = spelllist
            recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = SpellAdapter(it.distinct().toMutableList())
        }
        viewModel.list.observe(this,observer)
        var name = intent.getStringExtra("name")
        if(name.isNullOrEmpty()){
            name = ""
        }
        viewModel.getspells(intent.getStringExtra("clas"),name,intent.getStringExtra("school"),intent.getStringExtra("level"),assets.open("spells.json"))
    }
}