package com.example.whatsappclone.adapter

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsappclone.databinding.ListCallsBinding
import com.example.whatsappclone.model.CallData
import com.example.whatsappclone.model.CallType

class CallsListAdapter(
    private val callList: List<CallData>
) : RecyclerView.Adapter<CallsListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = callList[position]
        holder.bind(currentItem)
    }

    override fun getItemCount() = callList.size

    class ViewHolder private constructor(private val binding: ListCallsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(
            currentItem: CallData
        ) {
            binding.apply {
                callNameTextView.text = currentItem.callName
                dateTimeTextView.text = currentItem.callDateTime
                callImage.setImageDrawable(currentItem.callImage)
            }
            when (currentItem.callType) {
                CallType.OUTGOING_CALL -> {
                    binding.callType.apply {
                        rotation = 310f
                        imageTintList = ColorStateList.valueOf(Color.rgb(0, 169, 157))
                    }
                }
                CallType.RECEIVED_CALL -> {
                    binding.callType.apply {
                        rotation = 130f
                        imageTintList = ColorStateList.valueOf(Color.rgb(0, 169, 157))
                    }
                }
                CallType.MISSED_CALL -> {
                    binding.callType.apply {
                        rotation = 130f
                        imageTintList = ColorStateList.valueOf(Color.rgb(255, 0, 0))
                    }
                }
            }
        }

        companion object {
            fun from(parent: ViewGroup) = ViewHolder(
                ListCallsBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
    }


}