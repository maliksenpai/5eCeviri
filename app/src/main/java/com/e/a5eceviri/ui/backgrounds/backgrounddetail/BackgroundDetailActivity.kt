package com.e.a5eceviri.ui.backgrounds.backgrounddetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.e.a5eceviri.R
import com.e.a5eceviri.databinding.ActivityBackgroundDetailBinding
import com.e.a5eceviri.databinding.ActivityClassDetailBinding
import com.e.a5eceviri.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_background_detail.*

class BackgroundDetailActivity : BaseActivity<ActivityBackgroundDetailBinding,BackgroundDetailViewModel>(BackgroundDetailViewModel::class.java) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun getLayout(): Int {
        return R.layout.activity_background_detail
    }

    override fun init() {

    }

    override fun initviewmodel() {
        binding.modelView=viewModel
        var observer = Observer<MutableList<String>>{
            bgnametext.setText(it[0])
            bgskilltext.setText(it[1])
            bglanguagetext.setText(it[2])
            bgtooltext.setText(it[3])
            bgeqiupmenttext.setText(it[4])
            bgfeaturestext.setText(it[5])
            bgsuggestedtext.setText(it[6])
        }
        viewModel.list.observe(this,observer)
        viewModel.getdetail(intent.getStringExtra("name"),assets.open("background.json"))
    }
}