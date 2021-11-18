package com.example.whatsappclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsappclone.databinding.ListChatsBinding
import com.example.whatsappclone.model.ChatData

class ChatListAdapter(
    private val chatDataList : List<ChatData>
) : RecyclerView.Adapter<ChatListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = chatDataList[position]
        holder.bind(currentItem)
    }

    override fun getItemCount() = chatDataList.size

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    class ViewHolder private constructor(val binding: ListChatsBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(
            currentItem: ChatData
        ) {
            binding.chatImage.setImageDrawable(currentItem.chatImage)
            binding.chatNameTextView.text = currentItem.chatName
            binding.recentMessageTextView.text = currentItem.recentMessage
            binding.textView3.text = currentItem.chatDateTime

        }
        companion object {
            fun from(parent: ViewGroup) = ViewHolder(
                ListChatsBinding.inflate(
                    LayoutInflater.from(
                        parent.context
                    ),
                    parent,
                    false
                )
            )
        }
    }


}