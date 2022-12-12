package com.example.shwemi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shwemi.databinding.FragmentSupplyRequestDetailBinding

class SupplyRequestDetailFragment:Fragment() {

    private lateinit var binding : FragmentSupplyRequestDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentSupplyRequestDetailBinding.inflate(inflater).also {
            binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val detailAdapter = DetailRecyclerAdapter()
        binding.rvDetail.adapter = detailAdapter
        detailAdapter.submitList(listOf(
            DetailData("1"),
            DetailData("2"),
            DetailData("3"),
            DetailData("4"),
            DetailData("5"),
            DetailData("6"),
            DetailData("7"),
            DetailData("8"),
            DetailData("9"),
            DetailData("10"),
            DetailData("11"),
            DetailData("12"),
            DetailData("13"),
            DetailData("14"),
        ))
    }
}