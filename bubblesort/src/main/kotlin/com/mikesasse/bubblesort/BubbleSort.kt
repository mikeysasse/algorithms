package com.mikesasse.bubblesort

/**
 * Bubble sort is a straight-forward sorting algorithm that
 * "bubbles" the highest numbers to the top.
 */
fun bubbleSort(input: Array<Int>): Array<Int> {
    val list = input.copyOf()
    do {
        var swapped = false
        for (a in list.indices) {
            for (b in a + 1 until list.size) {
                if (list[b] > list[a]) {
                    val temp = list[b]
                    list[b] = list[a]
                    list[a] = temp
                    swapped = true
                }
            }
        }
    } while (swapped)
    return list
}
