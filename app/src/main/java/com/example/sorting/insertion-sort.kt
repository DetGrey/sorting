package com.example.sorting

fun main() {
    val unsortedStrings = listOf("banana", "apple", "orange", "grape", "kiwi",
        "pineapple", "watermelon", "strawberry", "blueberry", "raspberry",
        "peach", "pear", "mango", "lemon", "lime",
        "cherry", "plum", "apricot", "blackberry", "papaya"
    )

    println("Unsorted:")
    println(unsortedStrings)
    println()

    println("Sorted:")
    println(insertionSort(unsortedStrings))
}

/* Implement the [insertion sort](https://www.youtube.com/watch?v=O0VbBkUvriI) algorithm with
the following elements:

val unsortedStrings = listOf("banana", "apple", "orange", "grape", "kiwi",
 "pineapple", "watermelon", "strawberry", "blueberry", "raspberry",
 "peach", "pear", "mango", "lemon", "lime",
 "cherry", "plum", "apricot", "blackberry", "papaya"
)

- Understand the algorithm with pen and paper
- [Visualisation](https://youtu.be/JU767SDMDvA?si=3pT2PlxJW48F3wll)
 */

fun insertionSort(list: List<String>): MutableList<String> {
    val sortedList: MutableList<String> = list.toMutableList()
    // Mark first word as sorted
    // Look at next word and see if it should come before the first
    // if the two words should be swapped, do that, else mark as sorted


    var i = 1 // Since the first word is already sorted, we start at index 1

    while (i < list.size) {

        if (sortedList[i] < sortedList[i-1]) { // If the first unsorted item should come before the last sorted item
//            println("${sortedList[i]}")
            var sortedIndex = i - 1
            var unsortedIndex = i

            while (sortedIndex >= 0) { // Iterate through the sorted items
//                println()
//                println("Is ${sortedList[unsortedIndex]}[$unsortedIndex] < ${sortedList[sortedIndex]}[$sortedIndex]")

                if (sortedList[unsortedIndex] < sortedList[sortedIndex]) { // If unsorted item is less than sorted item
//                    println("yes")
                    val temp = sortedList[unsortedIndex]
                    sortedList[unsortedIndex] = sortedList[sortedIndex]
                    sortedList[sortedIndex] = temp
                    unsortedIndex--
                }
                else {
//                    println("no")
                    break // Stop looking through the sorted items when hitting the first item that it is not less than
                }
                sortedIndex--
            }
        }

        i++
    }
    return sortedList
}