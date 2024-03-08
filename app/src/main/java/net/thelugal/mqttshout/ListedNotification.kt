package net.thelugal.mqttshout

data class ListedNotification(
    val title: String,
    val body: String,
    val server: String,
    val topic: String
)