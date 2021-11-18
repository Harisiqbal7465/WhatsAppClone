package com.example.whatsappclone.adapter

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Color.red
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsappclone.R
import com.example.whatsappclone.databinding.ListCallsBinding
import com.example.whatsappclone.model.CallData
import com.example.whatsappclone.model.CallType

class CallsListAdapter(
    private val callList: List<CallData>
): RecyclerView.Adapter<CallsListAdapter.ViewHolder>() {
    class ViewHolder(val binding: ListCallsBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ListCallsBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = callList[position]

        holder.binding.apply {
            callNameTextView.text = currentItem.callName
            dateTimeTextView.text = currentItem.callDateTime
            callImage.setImageDrawable(currentItem.callImage)
        }
        when (currentItem.callType) {
            CallType.OUTGOING_CALL -> {
                holder.binding.callType.apply {
                    rotation = 310f
                    imageTintList = ColorStateList.valueOf(Color.rgb(0, 169, 157))
                }
            }
            CallType.RECEIVED_CALL -> {
                holder.binding.callType.apply {
                    rotation = 130f
                    imageTintList = ColorStateList.valueOf(Color.rgb(0, 169, 157))
                }
            }
            CallType.MISSED_CALL -> {
                holder.binding.callType.apply {
                    rotation = 130f
                    imageTintList = ColorStateList.valueOf(Color.rgb(255,0,0))
                }
            }
        }
    }

    override fun getItemCount() = callList.size
}