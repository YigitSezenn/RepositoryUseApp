package com.example.jetpackcomposeegitim.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpackcomposeegitim.LoginScreen
import com.example.jetpackcomposeegitim.RegisterScreen
import com.example.jetpackcomposeegitim.ui.notes.NotesScreen
import com.example.jetpackcomposeegitim.ui.sharedpreferences.SharedPreferencesScreen
import com.example.jetpackcomposeegitim.ui.users.UsersScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = NavigatioItem.Login.route
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(NavigatioItem.Login.route) {
            LoginScreen(navController)
        }
        composable(NavigatioItem.Users.route) {
            UsersScreen()
        }
        composable(NavigatioItem.SharedPreferences.route) {
            SharedPreferencesScreen()
        }
        composable(NavigatioItem.Note.route) {
            NotesScreen()
        }
        composable("${NavigatioItem.Register.route}/{nameSurname}"
        ) {
            val nameSurname = it.arguments?.getString("nameSurname") ?: ""
            RegisterScreen(navController, nameSurname)
        }
    }
}