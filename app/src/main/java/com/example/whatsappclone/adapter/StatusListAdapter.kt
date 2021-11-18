package com.example.whatsappclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsappclone.databinding.ListStatusBinding
import com.example.whatsappclone.model.StatusData

class StatusListAdapter(
    private val statusList: List<StatusData>
): RecyclerView.Adapter<StatusListAdapter.ViewHolder>() {
    class ViewHolder(val binding: ListStatusBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ListStatusBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = statusList[position]
        holder.binding.apply {
            statusNameTextView.text = currentItem.statusName
            statusImage.setImageDrawable(currentItem.statusImage)
            dateTimeTextView.text = currentItem.statusDateTime
        }
    }

    override fun getItemCount() = statusList.size
}