package com.example.jetpackcomposeegitim.ui.users

data class UserModel (val id: Int, val name: String)

val mockUsers = listOf(
    UserModel(1, "Rıdvan Özcan"),
    UserModel(2, "Ahmet Yılmaz"),
    UserModel(3, "Ayşe Kaya")
)