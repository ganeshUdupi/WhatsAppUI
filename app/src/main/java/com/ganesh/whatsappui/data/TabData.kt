package com.ganesh.whatsappui.data

data class TabData(
    val title : String,
    val unreadCount:Int?
)

val tabs = listOf(
     TabData(title = Tabs.CHATS.value, unreadCount =null),
     TabData(title = Tabs.STATUS.value, unreadCount = null),
     TabData(title =Tabs.CALLS.value, unreadCount = null )
)
enum class Tabs(val value: String){
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}
const val INITIAL_SCREEN_INDEX=0

