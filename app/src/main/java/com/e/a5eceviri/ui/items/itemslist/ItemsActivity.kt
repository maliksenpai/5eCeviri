package com.e.a5eceviri.ui.items.itemslist

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.e.a5eceviri.R
import com.e.a5eceviri.databinding.ActivityItemsBinding
import com.e.a5eceviri.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_items.*

class ItemsActivity : BaseActivity<ActivityItemsBinding,ItemViewModel>(ItemViewModel::class.java) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getLayout(): Int {
        return R.layout.activity_items
    }

    override fun init() {

    }

    override fun initviewmodel() {
        binding.modelView=viewModel
        var observerlist = Observer<MutableList<String>>{
            var recyclerView = itemlist
            recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = ItemAdapter(it)
        }
        var observertext = Observer<String> {
            viewModel.listspefic(it,assets.open("items.json"))
        }
        viewModel.list.observe(this,observerlist)
        viewModel.string.observe(this,observertext)
        viewModel.listall(assets.open("items.json"))
    }
}