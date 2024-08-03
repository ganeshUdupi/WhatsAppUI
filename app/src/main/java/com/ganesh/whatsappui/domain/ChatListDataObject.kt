package com.ganesh.whatsappui.domain

import com.ganesh.whatsappui.R

data class ChatListDataObject(
    val chatId :Int,
    val message :Message,
    val userName :String,
    val userImage:Int = R.drawable.ic_user
)

data class Message(
    val content:String,
    val deliveryStatus:MessageDeliveryStatus,
    val type:MessageType,
    val timeStamp : String,
    val unreadCount : Int?=null
){

}

enum class MessageDeliveryStatus{
    DELIVERED,
    READ,
    PENDING,
    ERROR
}

enum class MessageType {
    TEXT,
    AUDIO,
    VIDEO,
    IMAGE
}