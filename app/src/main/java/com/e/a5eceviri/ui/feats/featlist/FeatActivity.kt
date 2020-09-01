package com.e.a5eceviri.ui.feats.featlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.e.a5eceviri.R
import com.e.a5eceviri.databinding.ActivityFeatBinding
import com.e.a5eceviri.model.api.response.featresponse.FeatList
import com.e.a5eceviri.ui.backgrounds.backgroundlist.BackgroundAdapter
import com.e.a5eceviri.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_feat.*

class FeatActivity : BaseActivity<ActivityFeatBinding,FeatViewModel>(FeatViewModel::class.java) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun getLayout(): Int {
        return R.layout.activity_feat
    }

    override fun init() {

    }

    override fun initviewmodel() {
        binding.modelView=viewModel
        var observer = Observer<MutableList<String>>{
            var recyclerView = featlist
            recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = FeatAdapter(it)
        }
        viewModel.list.observe(this,observer)
        viewModel.listfeats(assets.open("feat.json"))
    }
}