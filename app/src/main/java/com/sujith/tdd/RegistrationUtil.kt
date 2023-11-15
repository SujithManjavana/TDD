package com.sujith.tdd

object RegistrationUtil {

    private val existingUsers = listOf("John", "Peter")

    /**
     * The input is not valid if...
     * The username/password is empty
     * The username is taken
     * confirmed password doesn't match the real one
     * password is too short

     */
    fun validateRegInput(userName: String, password: String, confirmPassword: String): Boolean {
        if (userName.isEmpty() || password.isEmpty()) return false
        if (userName in existingUsers) return false
        if (password != confirmPassword) return false
        if (password.count { it.isDigit() } < 2) return false
        return true
    }
}