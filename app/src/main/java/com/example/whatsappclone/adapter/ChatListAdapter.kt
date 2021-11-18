package com.example.whatsappclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsappclone.databinding.ListChatsBinding
import com.example.whatsappclone.model.ChatData

class ChatListAdapter(
    private val chatDataList : List<ChatData>
) : RecyclerView.Adapter<ChatListAdapter.ViewHolder>() {
    class ViewHolder(val binding: ListChatsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ListChatsBinding.inflate(
            LayoutInflater.from(
                parent.context
            ),
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = chatDataList[position]
        holder.binding.chatImage.setImageDrawable(currentItem.chatImage)
        holder.binding.chatNameTextView.text = currentItem.chatName
        holder.binding.recentMessageTextView.text = currentItem.recentMessage
        holder.binding.textView3.text = currentItem.chatDateTime
    }

    override fun getItemCount() = chatDataList.size
}