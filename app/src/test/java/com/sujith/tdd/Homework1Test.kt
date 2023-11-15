package com.sujith.tdd


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class Homework1Test {

    @Test
    fun `correct braces returns true`() {
        val result = Homework1.checkBraces("(123)")
        assertThat(result).isTrue()
    }

    @Test
    fun `incorrect braces returns false`() {
        val result = Homework1.checkBraces("((123)")
        assertThat(result).isFalse()
    }

    @Test
    fun `fib of 1 returns 1`() {
        val result = Homework1.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `fib of 3 returns 2`() {
        val result = Homework1.fib(3)
        assertThat(result).isEqualTo(2)
    }

    @Test
    fun `fib of 11 returns 89`() {
        val result = Homework1.fib(11)
        assertThat(result).isEqualTo(89)
    }
}