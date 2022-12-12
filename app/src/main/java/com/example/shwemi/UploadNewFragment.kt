package com.example.shwemi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.shwemi.databinding.FragmentUploadNewBinding

class UploadNewFragment : Fragment() {

    private lateinit var binding: FragmentUploadNewBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentUploadNewBinding.inflate(inflater).also {
            binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var adapter = ArrayAdapter.createFromResource(requireContext(),R.array.gold_quality,R.layout.spinner_text_style)
        binding.spinner2.adapter=adapter


    }


}