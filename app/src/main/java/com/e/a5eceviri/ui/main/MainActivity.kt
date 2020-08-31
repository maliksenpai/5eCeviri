package com.e.a5eceviri.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.e.a5eceviri.R
import com.e.a5eceviri.databinding.ActivityMainBinding
import com.e.a5eceviri.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding,MainViewModel>(MainViewModel::class.java) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun init() {
        //başlangıç internet kontrolü
        initviewmodel()
    }

    override fun initviewmodel() {
        binding.viewModel=viewModel
    }
}