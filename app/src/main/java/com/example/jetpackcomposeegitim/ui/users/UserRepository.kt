package com.example.jetpackcomposeegitim.ui.users

import javax.inject.Inject

class UserRepository @Inject constructor() {

    suspend fun getUsers(): List<UserModel> {
        return mockUsers
    }
}