package com.example.whatsappclone.fragments


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsappclone.MainViewModel
import com.example.whatsappclone.R
import com.example.whatsappclone.adapter.CallsListAdapter
import com.example.whatsappclone.databinding.FragmentCallsBinding

class CallsFragment : Fragment(R.layout.fragment_calls) {
    private lateinit var binding: FragmentCallsBinding
    private lateinit var viewModel:MainViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCallsBinding.bind(view)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val list = viewModel.getCallList(requireContext())

        val adapter = CallsListAdapter(list)
        binding.recyclerVIew.apply {
            this.adapter = adapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }
}