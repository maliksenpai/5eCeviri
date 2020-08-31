package com.e.a5eceviri.ui.classes.classlist

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.e.a5eceviri.databinding.ActivityClassBinding
import com.e.a5eceviri.ui.base.BaseActivity
import com.e.a5eceviri.R
import kotlinx.android.synthetic.main.activity_class.*

class ClassActivity : BaseActivity<ActivityClassBinding,ClassViewModel>(ClassViewModel::class.java) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun getLayout(): Int {
        return R.layout.activity_class
    }

    override fun init() {

    }

    override fun initviewmodel() {
        binding.viewModel=viewModel
        val observer = Observer<MutableList<String>>{
            var recyclerView = classlist
            recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = ClassAdapter(it)
        }
        viewModel.list.observe(this,observer)
        viewModel.listclass(assets.open("classes.json"))
    }
}