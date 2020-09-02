package com.e.a5eceviri.ui.items.itemdetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.e.a5eceviri.R
import com.e.a5eceviri.databinding.ActivityItemDetailBinding
import com.e.a5eceviri.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_item_detail.*

class ItemDetailActivity :BaseActivity<ActivityItemDetailBinding,ItemDetailViewModel>(ItemDetailViewModel::class.java) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun getLayout(): Int {
        return R.layout.activity_item_detail
    }

    override fun init() {

    }

    override fun initviewmodel() {
        binding.modelView=viewModel
        var observer = Observer<MutableList<String>>{
            itemnametext.setText(it[0])
            itemraritytext.setText(it[1])
            itemdesctext.setText(it[2])
        }
        viewModel.list.observe(this,observer)
        viewModel.getdetail(intent.getStringExtra("name"),assets.open("items.json"))
    }
}