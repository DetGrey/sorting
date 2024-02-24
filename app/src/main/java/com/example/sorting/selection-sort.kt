package com.example.sorting

fun main() {
    val unsortedNumbers = listOf(29, 15, 8, 47, 63, 22, 56, 31, 74, 19, 33, 41, 52, 60, 10, 88, 92, 38, 45, 17)

    println("Unsorted:")
    println(unsortedNumbers)
    println("Sorted:")
    println(selectionSort2(unsortedNumbers))
}

/* Implement the [selection sort](https://www.youtube.com/watch?v=3hH8kTHFw2A) algorithm
with the following elements:

val unsortedNumbers = listOf(29, 15, 8, 47, 63, 22, 56, 31, 74, 19, 33, 41, 52, 60, 10, 88, 92, 38, 45, 17)

- Understand the algorithm with pen and paper
- [Visualisation](https://www.youtube.com/watch?v=Iccmrk2ZWoc)

 */

fun selectionSort(list: List<Int>): MutableList<Int> {
    val unsortedList: MutableList<Int> = list.toMutableList()
    val sortedList: MutableList<Int> = mutableListOf()

    var i = 0

    while (i < list.size) {

        var min = unsortedList[0]

        for (num in unsortedList) {
            if (num < min) {
                min = num
            }
        }

        sortedList.add(min)
        unsortedList.remove(min)

        i++
    }

    return sortedList
}

fun selectionSort2(list: List<Int>): MutableList<Int> {
    val sortedList: MutableList<Int> = list.toMutableList()

    var sortedIndex = 0

    while (sortedIndex < list.size) {

        var min = sortedIndex

        for (i in sortedIndex until sortedList.size) {
            if (sortedList[i] < sortedList[min]) {
                min = i
            }
        }

        // SWAP THE LOWEST NUM WITH THE FIRST UNSORTED NUM
        val temp = sortedList[min]
        sortedList[min] = sortedList[sortedIndex]
        sortedList[sortedIndex] = temp

        sortedIndex++
    }

    return sortedList
}