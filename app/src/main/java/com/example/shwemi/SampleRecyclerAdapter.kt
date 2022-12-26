package com.example.shwemi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.shwemi.databinding.ItemSampleBinding

data class SampleData(
    val id : String,
    val title : String,
    val weight : String,
    val content : String
)

class SampleRecyclerAdapter:ListAdapter<SampleData,SampleViewHolder>(SampleDiffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        return SampleViewHolder(ItemSampleBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}

class SampleViewHolder(private var binding: ItemSampleBinding):RecyclerView.ViewHolder(binding.root){
    fun bind(data: SampleData){
        binding.tvWeight.text = data.weight
        binding.tvContent.text = data.content
    }
}

object SampleDiffUtil:DiffUtil.ItemCallback<SampleData>(){
    override fun areItemsTheSame(oldItem: SampleData, newItem: SampleData): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: SampleData, newItem: SampleData): Boolean {
        return oldItem == newItem
    }

}