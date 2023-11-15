package com.sujith.tdd

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat

import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {

    private lateinit var comparer: ResourceComparer
    private lateinit var ctx: Context

    @Before
    fun setUp() {
        //this function runs before each test
        comparer = ResourceComparer()
        ctx = ApplicationProvider.getApplicationContext()
    }

    @After
    fun tearDown() {
        //this function runs after each test
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        val result = comparer.isResourceSameAsString(ctx, R.string.app_name, "TDD")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentThanGivenString_returnsTrue() {
        val result = comparer.isResourceSameAsString(ctx, R.string.app_name, "Foo")
        assertThat(result).isFalse()
    }
}