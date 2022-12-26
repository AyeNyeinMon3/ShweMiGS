package com.example.shwemi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shwemi.databinding.FragmentSampleBinding

class SampleFragment:Fragment() {

    lateinit var binding: FragmentSampleBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentSampleBinding.inflate(inflater).also {
            binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = SampleRecyclerAdapter()
        binding.rvSample.adapter = adapter
        adapter.submitList(listOf(
            SampleData("1","SM-PRD-000000002","3gm","နမူနာ ဒီဇိုင်းအတိုင်းလုပ်ပေးပါ"),
            SampleData("2","SM-PRD-000000002","4gm","နမူနာ ဒီဇိုင်းအတိုင်းလုပ်ပေးပါ"),
            SampleData("3","SM-PRD-000000002","5gm","အဟန့်သည်နမူနာထက် မသေးရန်"),
            SampleData("4","SM-PRD-000000002","6gm","နမူနာ ဒီဇိုင်းအတိုင်းလုပ်ပေးပါအဟန့်သည်နမူနာထက် မသေးရန်"),
        ))

    }

}