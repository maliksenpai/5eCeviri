package com.e.a5eceviri.ui.races.racedetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.e.a5eceviri.R
import com.e.a5eceviri.databinding.ActivityRaceDetailBinding
import com.e.a5eceviri.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_race_detail.*

class RaceDetailActivity : BaseActivity<ActivityRaceDetailBinding,RaceDetailViewModel>(RaceDetailViewModel::class.java) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    override fun getLayout(): Int {
        return R.layout.activity_race_detail
    }

    override fun init() {

    }

    override fun initviewmodel() {
        binding.modelView=viewModel
        var observer = Observer<MutableList<String>>{
            racenametext.setText(it[0])
            racesizetext.setText(it[1])
            racespeedtext.setText(it[2])
            raceabitext.setText(it[3])
            racedesctext.setText(it[4])
            racesubtext.setText(it[5])
        }
        viewModel.list.observe(this,observer)
        viewModel.getdetail(intent.getStringExtra("name"),assets.open("races.json"))
    }

}