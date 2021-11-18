package com.example.whatsappclone.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsappclone.MainViewModel
import com.example.whatsappclone.R
import com.example.whatsappclone.adapter.ChatListAdapter
import com.example.whatsappclone.databinding.FragmentChatsBinding

class ChatsFragment : Fragment(R.layout.fragment_chats) {
    private lateinit var binding: FragmentChatsBinding
    private lateinit var viewModel: MainViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentChatsBinding.bind(view)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val list = viewModel.getChatList(requireContext())

        val adapter = ChatListAdapter(list)

        binding.recyclerView.apply {
            this.adapter =  adapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }
}