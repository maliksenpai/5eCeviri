package com.e.a5eceviri.ui.classes.classdetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.util.Log
import androidx.lifecycle.Observer
import com.e.a5eceviri.R
import com.e.a5eceviri.databinding.ActivityClassDetailBinding
import com.e.a5eceviri.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_class_detail.*

class ClassDetailActivity : BaseActivity<ActivityClassDetailBinding,ClassDetailViewModel>(ClassDetailViewModel::class.java) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun getLayout(): Int {
        return R.layout.activity_class_detail
    }

    override fun init() {

    }

    override fun initviewmodel() {
        binding.modelView=viewModel
        var observer = Observer<MutableList<String>>{
            classnametext.setText(it[0])
            classproficienytext.setText(it[1])
            classequipmenttext.setText(it[2])
            classdetailtext.setText(it[3])
            classtabletext.setText(it[4])
        }
        viewModel.text.observe(this,observer)
        viewModel.getdetail(intent.getStringExtra("name"),assets.open("classes.json"))
    }
}