package com.e.a5eceviri.ui.main

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
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
        val prefences = getSharedPreferences("first", Context.MODE_PRIVATE)
        var editor = prefences.edit()
        Log.d("gelen",prefences.getString("control","")+"x")
        if(prefences.getString("control","").isNullOrEmpty()){
            val info = AlertDialog.Builder(this)
            info.setTitle("Bilgilendirme")
            info.setMessage("Merhabalar uygulamamız hala geliştirme sürecindedir, yayınlanan sürümde biçimleme hataları, eksiklikler gibi problemlerle karşılaşabilirsiniz.\n" + "Bunların üzerinde çalışıp, gelişime devam edeceğiz. İyi oyunlar!")
            info.setNeutralButton("Anladım"){dialogInterface, i -> }
            info.show()
            editor.putString("control","oldu")
            editor.apply()
        }
    }

    override fun initviewmodel() {
        binding.viewModel=viewModel
    }
}