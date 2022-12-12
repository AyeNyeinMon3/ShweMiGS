package com.example.shwemi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shwemi.databinding.FragmentSupplyRequestItemBinding

class SupplyRequestItemFragment:Fragment() {

    private lateinit var binding: FragmentSupplyRequestItemBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       return FragmentSupplyRequestItemBinding.inflate(inflater).also {
           binding = it
       }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val supplyAdapter = SupplyRecyclerAdapter()
        binding.rv.adapter = supplyAdapter
        supplyAdapter.submitList(listOf(
            SupplyData("1","0","5","1"),
            SupplyData("2","2","3","1")
        ))
    }
}