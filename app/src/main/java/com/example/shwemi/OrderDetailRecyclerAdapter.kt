package com.example.shwemi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.shwemi.databinding.ItemOrderDetailBinding

class OrderDetailRecyclerAdapter : ListAdapter<OrderDetailData,OrderDetailViewHolder>(OrderDetailDiffUtils) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderDetailViewHolder {
        return OrderDetailViewHolder(ItemOrderDetailBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: OrderDetailViewHolder, position: Int) {

    }
}

data class OrderDetailData(
    val id : String
)

class OrderDetailViewHolder (private var binding: ItemOrderDetailBinding) : RecyclerView.ViewHolder(binding.root){

}

object OrderDetailDiffUtils : DiffUtil.ItemCallback<OrderDetailData>(){
    override fun areItemsTheSame(oldItem: OrderDetailData, newItem: OrderDetailData): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: OrderDetailData, newItem: OrderDetailData): Boolean {
        return oldItem == newItem
    }

}