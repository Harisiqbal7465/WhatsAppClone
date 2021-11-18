package com.example.whatsappclone

import android.content.Context
import androidx.appcompat.content.res.AppCompatResources
import androidx.lifecycle.ViewModel
import com.example.whatsappclone.model.CallData
import com.example.whatsappclone.model.CallType
import com.example.whatsappclone.model.ChatData
import com.example.whatsappclone.model.StatusData

class MainViewModel : ViewModel() {
    fun getChatList(context: Context) = listOf(
        ChatData(
            chatName = "Abdul Haseeb",
            chatImage = AppCompatResources.getDrawable(context, R.drawable.image3),
            chatDateTime = "Monday",
            recentMessage = "Okay"
        ),
        ChatData(
            chatName = "Hassan Azeem",
            chatImage = AppCompatResources.getDrawable(context, R.drawable.image2),
            chatDateTime = "Sunday",
            recentMessage = "let me check it"
        ),
        ChatData(
            chatName = "Shahabdin Khan",
            chatImage = AppCompatResources.getDrawable(context, R.drawable.image),
            chatDateTime = "Monday",
            recentMessage = "Assalam o Alaikum"
        )
    )

    fun getCallList(context: Context) = listOf(
        CallData(
            callName = "Hassan Azeem",
            callDateTime = "09/08/2020",
            callType = CallType.RECEIVED_CALL,
            callImage = AppCompatResources.getDrawable(context, R.drawable.image)
        ),
        CallData(
            callName = "Abdul Haseeb",
            callDateTime = "Friday",
            callType = CallType.MISSED_CALL,
            callImage = AppCompatResources.getDrawable(context, R.drawable.image2)
        ),
        CallData(
            callName = "Shahabdin",
            callDateTime = "09/08/2020",
            callType = CallType.OUTGOING_CALL,
            callImage = AppCompatResources.getDrawable(context, R.drawable.image3)
        ),
        CallData(
            callName = "Hassan Azeem",
            callDateTime = "09/08/2020",
            callType = CallType.RECEIVED_CALL,
            callImage = AppCompatResources.getDrawable(context, R.drawable.image)
        ),
        CallData(
            callName = "Abdul Haseeb",
            callDateTime = "Friday",
            callType = CallType.MISSED_CALL,
            callImage = AppCompatResources.getDrawable(context, R.drawable.image2)
        ),
        CallData(
            callName = "Shahabdin",
            callDateTime = "09/08/2020",
            callType = CallType.OUTGOING_CALL,
            callImage = AppCompatResources.getDrawable(context, R.drawable.image3)
        ),
        CallData(
            callName = "Hassan Azeem",
            callDateTime = "09/08/2020",
            callType = CallType.RECEIVED_CALL,
            callImage = AppCompatResources.getDrawable(context, R.drawable.image)
        ),
        CallData(
            callName = "Abdul Haseeb",
            callDateTime = "Friday",
            callType = CallType.MISSED_CALL,
            callImage = AppCompatResources.getDrawable(context, R.drawable.image2)
        ),
        CallData(
            callName = "Shahabdin",
            callDateTime = "09/08/2020",
            callType = CallType.OUTGOING_CALL,
            callImage = AppCompatResources.getDrawable(context, R.drawable.image3)
        ),
        CallData(
            callName = "Hassan Azeem",
            callDateTime = "09/08/2020",
            callType = CallType.RECEIVED_CALL,
            callImage = AppCompatResources.getDrawable(context, R.drawable.image)
        ),
        CallData(
            callName = "Abdul Haseeb",
            callDateTime = "Friday",
            callType = CallType.MISSED_CALL,
            callImage = AppCompatResources.getDrawable(context, R.drawable.image2)
        ),
        CallData(
            callName = "Shahabdin",
            callDateTime = "09/08/2020",
            callType = CallType.OUTGOING_CALL,
            callImage = AppCompatResources.getDrawable(context, R.drawable.image3)
        ),
    )

    fun getStatusList(context: Context) = listOf(
        StatusData(
            statusName = "Abdul Haseeb",
            statusImage = AppCompatResources.getDrawable(context, R.drawable.image),
            statusDateTime = "5 mint ago"
        ),
        StatusData(
            statusName = "Hassan Azeem",
            statusImage = AppCompatResources.getDrawable(context, R.drawable.image2),
            statusDateTime = "5 mint ago"
        ),
        StatusData(
            statusName = "Shahabdin",
            statusImage = AppCompatResources.getDrawable(context, R.drawable.image3),
            statusDateTime = "5 mint ago"
        ),
    )
}