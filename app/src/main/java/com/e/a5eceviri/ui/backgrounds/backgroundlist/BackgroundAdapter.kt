package com.e.a5eceviri.ui.backgrounds.backgroundlist

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.e.a5eceviri.R
import com.e.a5eceviri.ui.backgrounds.backgrounddetail.BackgroundDetailActivity
import com.e.a5eceviri.ui.classes.classdetail.ClassDetailActivity
import com.e.a5eceviri.ui.classes.classlist.ClassAdapter

class BackgroundAdapter(val list:MutableList<String>): RecyclerView.Adapter<BackgroundAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var text = itemView.findViewById<TextView>(R.id.classlisttext)
        var layout = itemView.findViewById<LinearLayout>(R.id.classlistlayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.class_items,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text.setText(list.get(position))
        holder.layout.setOnClickListener {
            var context = holder.itemView.context
            var intent = Intent(context, BackgroundDetailActivity::class.java)
            intent.putExtra("name",list.get(position))
            context.startActivity(intent)
        }
    }
}