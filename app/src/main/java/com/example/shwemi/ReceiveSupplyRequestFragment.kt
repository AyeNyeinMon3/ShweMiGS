package com.example.shwemi

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.shwemi.databinding.FragmentReceiveSupplyRequestBinding

class ReceiveSupplyRequestFragment:Fragment() {
    private lateinit var binding: FragmentReceiveSupplyRequestBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentReceiveSupplyRequestBinding.inflate(inflater).also {
            binding = it
        }.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}