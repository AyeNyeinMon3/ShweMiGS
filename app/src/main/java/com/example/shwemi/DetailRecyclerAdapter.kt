package com.example.shwemi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.shwemi.databinding.ItemDetailBinding

data class DetailData(
    val id : String
)

class DetailRecyclerAdapter:ListAdapter<DetailData,DetailViewHolder>(DetailDiffUtils) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailViewHolder {
        return DetailViewHolder(ItemDetailBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {

    }
}

class DetailViewHolder(private var binding: ItemDetailBinding) : RecyclerView.ViewHolder(binding.root){

}

object DetailDiffUtils : DiffUtil.ItemCallback<DetailData>(){
    override fun areItemsTheSame(oldItem: DetailData, newItem: DetailData): Boolean {
        return oldItem.id==newItem.id
    }

    override fun areContentsTheSame(oldItem: DetailData, newItem: DetailData): Boolean {
        return oldItem==newItem
    }

}