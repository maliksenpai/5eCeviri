package com.e.a5eceviri.ui.feats.featdetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.e.a5eceviri.R
import com.e.a5eceviri.databinding.ActivityFeatDetailBinding
import com.e.a5eceviri.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_feat_detail.*

class FeatDetailActivity : BaseActivity<ActivityFeatDetailBinding,FeatDetailViewModel>(FeatDetailViewModel::class.java) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun getLayout(): Int {
        return R.layout.activity_feat_detail
    }

    override fun init() {

    }

    override fun initviewmodel() {
        binding.modelView=viewModel
        var observer = Observer<MutableList<String>>{
            featnametext.setText(it[0])
            featdesctext.setText(it[1])
            featabilitytext.setText(it[2])
            if(it[3]==" "){
                featpretext.setText("Gereksinim yok")
            }else{
                featpretext.setText(it[3])
            }
        }
        viewModel.list.observe(this,observer)
        viewModel.getdetail(intent.getStringExtra("name"),assets.open("feat.json"))
    }
}