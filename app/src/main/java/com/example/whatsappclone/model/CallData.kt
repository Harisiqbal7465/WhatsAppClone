package com.example.whatsappclone.model

import android.graphics.drawable.Drawable

data class CallData(
    val callName: String,
    val callDateTime: String,
    val callType: CallType,
    val callImage: Drawable?
)

enum class CallType{
    RECEIVED_CALL,
    MISSED_CALL,
    OUTGOING_CALL
}