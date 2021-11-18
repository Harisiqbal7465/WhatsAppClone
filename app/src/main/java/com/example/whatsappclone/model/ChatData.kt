package com.example.whatsappclone.model

import android.graphics.drawable.Drawable

data class ChatData(
    val chatName: String,
    val chatImage: Drawable?,
    val recentMessage: String,
    val chatDateTime: String,
)