package com.sujith.tdd


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegInput("", "123", "123")
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated passwords returns true`() {
        val result = RegistrationUtil.validateRegInput("foo", "123A", "123A")
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegInput("John", "123", "123")
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegInput("Job", "", "1234")
        assertThat(result).isFalse()
    }

    @Test
    fun `passwords repeated incorrectly returns false`() {
        val result = RegistrationUtil.validateRegInput("Jacob", "1234A", "1234")
        assertThat(result).isFalse()
    }

    @Test
    fun `passwords is too short returns false`() {
        val result = RegistrationUtil.validateRegInput("Fred", "a", "a")
        assertThat(result).isFalse()
    }
}