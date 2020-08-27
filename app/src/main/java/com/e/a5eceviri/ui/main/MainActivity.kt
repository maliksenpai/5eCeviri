package com.e.a5eceviri.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.e.a5eceviri.R
import com.e.a5eceviri.databinding.ActivityMainBinding
import com.e.a5eceviri.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding,MainViewModel>(MainViewModel::class.java) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun init() {
        //başlangıç internet kontrolü
    }

    override fun initviewmodel() {
        binding.viewModel=viewModel
    }
}