package com.example.reclyerviewsactivity

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NamesRecyclerViewAdaptor(var nameslist:List<String>):RecyclerView.Adapter<NameViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.name_list_item,parent,false)
        return NameViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        holder.tvName.text=nameslist.get(position)
    }

    override fun getItemCount(): Int {
        return nameslist.size

    }
}
class NameViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
     var tvName=itemView.findViewById<TextView>(R.id.tvname)

}