package com.e.a5eceviri.ui.races.racelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.e.a5eceviri.R
import com.e.a5eceviri.databinding.ActivityRace2Binding
import com.e.a5eceviri.ui.base.BaseActivity
import com.e.a5eceviri.ui.classes.classlist.ClassAdapter
import kotlinx.android.synthetic.main.activity_class.*
import kotlinx.android.synthetic.main.activity_race2.*

class RaceActivity : BaseActivity<ActivityRace2Binding,RaceViewModel>(RaceViewModel::class.java) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun getLayout(): Int {
        return R.layout.activity_race2
    }

    override fun init() {
    }

    override fun initviewmodel() {
        binding.modelView=viewModel
        val observer = Observer<MutableList<String>>{
            var recyclerView = racelist
            recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = RaceAdapter(it)
        }
        viewModel.list.observe(this,observer)
        viewModel.listrace(assets.open("races.json"))
    }
}