package com.example.whatsappclone.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsappclone.MainViewModel
import com.example.whatsappclone.R
import com.example.whatsappclone.adapter.StatusListAdapter
import com.example.whatsappclone.databinding.FragmentStatusBinding

class StatusFragment : Fragment(R.layout.fragment_status) {
    private lateinit var binding: FragmentStatusBinding
    private lateinit var viewModel: MainViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentStatusBinding.bind(view)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        val list = viewModel.getStatusList(requireContext())
        val adapter = StatusListAdapter(list)
        binding.recyclerViewStatuses.apply {
            this.adapter = adapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }
}