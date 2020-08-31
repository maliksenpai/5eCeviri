package com.e.a5eceviri.ui.backgrounds.backgroundlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.e.a5eceviri.R
import com.e.a5eceviri.databinding.ActivityBackgroundBinding
import com.e.a5eceviri.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_background.*

class BackgroundActivity : BaseActivity<ActivityBackgroundBinding,BackgroundViewModel>(BackgroundViewModel::class.java) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun getLayout(): Int {
        return R.layout.activity_background
    }

    override fun init() {

    }

    override fun initviewmodel() {
        binding.modelView=viewModel
        var observer = Observer<MutableList<String>>{
            var recyclerView = backgroundlist
            recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = BackgroundAdapter(it)
        }
        viewModel.list.observe(this,observer)
        viewModel.listbackground(assets.open("background.json"))
    }
}