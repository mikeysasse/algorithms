package com.mikesasse.bubblesort

import org.junit.jupiter.api.Test
import kotlin.random.Random

object SortTest {

    /**
     * The amount of test cases to generate.
     */
    private const val TEST_COUNT = 100

    /**
     * The length of each individual test case.
     */
    private const val TEST_CASE_LENGTH = 100

    /**
     * Generates a new list of test cases.
     */
    private fun generateTestCases(): List<Array<Int>> {
        val tests = mutableListOf<Array<Int>>()
        for (i in 0 until TEST_COUNT) {
            val test = mutableListOf<Int>()
            repeat(TEST_CASE_LENGTH) { test.add(Random.nextInt(0, 500)) }
            tests.add(test.toTypedArray())
        }
        return tests
    }

    @Test
    fun `test sort`() {
        generateTestCases().forEach {
            val expected = it.sortedArrayDescending()
            val actual = bubbleSort(it)
            assert(expected.contentEquals(actual)) {
                println("Expected=${expected.contentToString()}")
                println("Actual=${actual.contentToString()}")
            }
        }
    }
}