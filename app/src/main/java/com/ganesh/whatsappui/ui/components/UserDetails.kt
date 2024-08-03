package com.ganesh.whatsappui.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ganesh.whatsappui.domain.ChatListDataObject
import com.ganesh.whatsappui.domain.Message
import com.ganesh.whatsappui.domain.MessageDeliveryStatus
import com.ganesh.whatsappui.domain.MessageType
import com.ganesh.whatsappui.ui.theme.HighLightGreen

@Composable
fun UserDetails(chatData: ChatListDataObject) {

    Column(
        modifier = Modifier
            .wrapContentHeight()
            .padding(start = 16.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        MessageHeader(chatData)
        MessageSubsection(chatData)

    }

}

@Composable
fun MessageHeader(chatData: ChatListDataObject) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        TextComponent(
            modifier = Modifier.weight(1f),
            value = chatData.userName,
            fontSize = 16.sp,
            color = Color.Black,
            fontWeight = FontWeight.SemiBold
        )
        TextComponent(
            value = chatData.message.timeStamp,
            fontSize = 12.sp,
            color = if (chatData.message.unreadCount?:0>0) HighLightGreen else Color.Gray,
            modifier = null,
            fontWeight = FontWeight.SemiBold
        )

    }

}

@Composable
fun MessageSubsection(chatData: ChatListDataObject) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        TextComponent(
            value = chatData.message.content,
            fontSize = 16.sp,
            color = Color.Gray,
            modifier = Modifier.weight(1f),
        )
        chatData.message.unreadCount?.also {
            CircularCount(
                unreadCount = it.toString(),
                backgroundColor = HighLightGreen,
                textColor = Color.White)
        }


    }
}

@Preview(showBackground = true)
@Composable
fun UserDetailsPreview() {
    ChatListDataObject(
        chatId = 4, message = Message(
            content = "Happy Birthday!",
            timeStamp = "25/02/2023",
            type = MessageType.TEXT,
            deliveryStatus = MessageDeliveryStatus.DELIVERED
        ), userName = "Sachin Tendulkar"
    )
}