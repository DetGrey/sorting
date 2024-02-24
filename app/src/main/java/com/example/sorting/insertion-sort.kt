package com.example.sorting

fun main() {
    val unsortedStrings = listOf("banana", "apple", "orange", "grape", "kiwi",
        "pineapple", "watermelon", "strawberry", "blueberry", "raspberry",
        "peach", "pear", "mango", "lemon", "lime",
        "cherry", "plum", "apricot", "blackberry", "papaya"
    )

    insertionSort(unsortedStrings)

//    println("Unsorted:")
//    println(unsortedStrings)
//    println("Sorted:")
//    println()
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

fun insertionSort(list: List<String>) {
    val sortedList: MutableList<String> = list.toMutableList()
    // Mark first word as sorted
    // Look at next word and see if it should come before the first
    // if the two words should be swapped, do that, else mark as sorted

    var i = 1

    while (i < list.size) {

        for (j in 0..i) {
            if (sortedList[i] < sortedList[j]) {
                val temp = sortedList[i]
                sortedList[j+1] = sortedList[j]
                sortedList[j] = temp
            }
        }

        println(list[i])
        println(sortedList)
        i++

    }


}