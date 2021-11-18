package com.example.whatsappclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsappclone.databinding.ListStatusBinding
import com.example.whatsappclone.model.StatusData

class StatusListAdapter(
    private val statusList: List<StatusData>
): RecyclerView.Adapter<StatusListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = statusList[position]
        holder.bind(currentItem)
    }
    
    override fun getItemCount() = statusList.size

    class ViewHolder private constructor(val binding: ListStatusBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(
            currentItem: StatusData
        ) {
            binding.apply {
                statusNameTextView.text = currentItem.statusName
                statusImage.setImageDrawable(currentItem.statusImage)
                dateTimeTextView.text = currentItem.statusDateTime
            }
        }
        companion object {
            fun from(parent: ViewGroup) = ViewHolder(
                ListStatusBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
    }

}