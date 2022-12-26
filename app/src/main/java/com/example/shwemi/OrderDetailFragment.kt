package com.example.shwemi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.shwemi.databinding.FragmentOrderDetailBinding

class OrderDetailFragment : Fragment() {

    private lateinit var binding:FragmentOrderDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentOrderDetailBinding.inflate(inflater).also {
            binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val orderDetail = OrderDetailRecyclerAdapter()
        binding.rvOrderDetail.adapter = orderDetail
        orderDetail.submitList(listOf(
            OrderDetailData("1"),
            OrderDetailData("2"),
            OrderDetailData("3"),
            OrderDetailData("4"),
            OrderDetailData("5"),
            OrderDetailData("6"),
            OrderDetailData("7"),
            OrderDetailData("8"),
            OrderDetailData("9"),
            OrderDetailData("10"),
            OrderDetailData("11"),
            OrderDetailData("12"),
        ))

    }

}