package com.example.shwemi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.shwemi.databinding.ItemSupplyBinding

data class SupplyData(
    val id: String,
    val kyat: String,
    val pal: String,
    val yway: String
)

class SupplyRecyclerAdapter: ListAdapter<SupplyData,SupplyViewHolder>(SupplyDiffUtils) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SupplyViewHolder {
        return SupplyViewHolder(ItemSupplyBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: SupplyViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}

class SupplyViewHolder(private var binding: ItemSupplyBinding) : RecyclerView.ViewHolder(binding.root){
    fun bind(data: SupplyData){
        binding.tvK.text = data.kyat
        binding.tvP.text = data.pal
        binding.tvY.text = data.yway
    }

}

object SupplyDiffUtils : DiffUtil.ItemCallback<SupplyData>(){
    override fun areItemsTheSame(oldItem: SupplyData, newItem: SupplyData): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: SupplyData, newItem: SupplyData): Boolean {
        return oldItem==newItem
    }

}