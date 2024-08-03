package com.ganesh.whatsappui.data

import com.ganesh.whatsappui.domain.ChatListDataObject
import com.ganesh.whatsappui.domain.Message
import com.ganesh.whatsappui.domain.MessageDeliveryStatus
import com.ganesh.whatsappui.domain.MessageType

val chatList = listOf(
    ChatListDataObject(
        chatId = 1,
        message = Message(
            content = "Good morning",
            timeStamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = null
        ),
        userName = "Virat Kohli"
    ),
    ChatListDataObject(
        chatId = 2,
        message = Message(
            content = "How are you?",
            timeStamp = "27/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.READ,
            unreadCount = null
        ),
        userName = "MS Dhoni"
    ),
    ChatListDataObject(
        chatId = 3,
        message = Message(
            content = "Let's catch up later",
            timeStamp = "26/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 6
        ),
        userName = "Rohit Sharma"
    ),
    ChatListDataObject(
        chatId = 4,
        message = Message(
            content = "Happy Birthday!",
            timeStamp = "25/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED,
            unreadCount = 5
        ),
        userName = "Sachin Tendulkar"
    )
)

