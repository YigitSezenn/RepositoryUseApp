package com.example.jetpackcomposeegitim.navigation

enum class Screen {
    LOGIN,
    REGISTER,
    USERS,
    SHAREDPREFERENCES,
    NOTE
}

sealed class NavigatioItem(val route: String) {
    object Login: NavigatioItem(Screen.LOGIN.name)
    object Register: NavigatioItem(Screen.REGISTER.name)
    object Users: NavigatioItem(Screen.USERS.name)
    object SharedPreferences: NavigatioItem(Screen.SHAREDPREFERENCES.name)
    object Note: NavigatioItem(Screen.NOTE.name)
}