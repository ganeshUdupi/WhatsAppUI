package com.ganesh.whatsappui.data

data class TabData(
    val title : String
)

val tabs = listOf(
     TabData(title = Tabs.CALLS.value),
     TabData(title = Tabs.STATUS.value),
     TabData(title =Tabs.CALLS.value )
)
enum class Tabs(val value: String){
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}
