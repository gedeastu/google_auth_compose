package com.example.googleauth.presentation.sign_in

data class SignInState(
    val isSignSuccessful: Boolean = false,
    val signInError : String? = null
)