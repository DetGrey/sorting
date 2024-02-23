---
tags:
  - applikationsudvikling
  - sorting
  - kotlin
---
Class preparation: [Bubble sort](https://youtu.be/RT-hUXUWQ2I?si=gzVNCZyj4D0chmzD) | [Insertion sort](https://youtu.be/O0VbBkUvriI?si=WMZfxMIHavfkC5wK) | [Selection sort](https://youtu.be/3hH8kTHFw2A?si=bI561cJX1JdWpOu6)
___
# Exercises: Code comprehension & Big-O

Read the following code bits and determine their worst-case run-time:

## **A)**
​
```kotlin
fun detectAnomalies(sensorData: List<Double>): List<Int> {
    val anomalies = mutableListOf<Int>()
    for (i in sensorData) {
        if (sensorData[i] > 10.0) {
            anomalies.add(i)
        }
    }
    return anomalies
}
```

Worst-case runtime: O(n)

## **B)**

```kotlin
fun main() {
    val phoneNumberMap = mapOf(
        "John" to "555-1234",
        "Alice" to "555-5678",
        "Bob" to "555-9012"
    )
​
    val alicePhoneNumber = phoneNumberMap["Alice"]
    println("Alice's phone number: $alicePhoneNumber")
}
```

Worst-case runtime: O(1)

## **C)**

```kotlin
fun linearSearch(arr: IntArray, target: Int): Int {
    for (i in arr.indices) {
        if (arr[i] == target) {
            return i
        }
    }
    return -1
}
```

Worst-case runtime: O(n)

## **D)**

```kotlin
fun subtotals(array: IntArray): List<Int> {
    val subtotalArray = mutableListOf<Int>()
    for (i in array.indices) {
        var subtotal = 0
        for (j in 0..i) {
            subtotal += array[j]
        }
        subtotalArray.add(subtotal)
    }
    return subtotalArray
}
```

Worst-case runtime: O(n^2)

## **E)**

```kotlin
data class Order(
    val orderId: String,
    val items: List<Item>
)
​
data class Item(
    val itemId: String,
    val price: Double
)
​
fun findHighValueOrders(orders: List<Order>, threshold: Double): List<String> {
    val highValueOrderIds = mutableListOf<String>()
​
    for (order in orders) {
        var totalOrderValue = 0.0
        for (item in order.items) {
            totalOrderValue += item.price
        }
        if (totalOrderValue > threshold) {
            highValueOrderIds.add(order.orderId)
        }
    }
​
    return highValueOrderIds
}
```

Worst-case runtime: O(n * m)

## **F)**

![](https://filerepository.itslearning.com/5f751072-72c4-4375-bc06-2a68aac2d5e4?Token=o68GAFS8DQDg6thlAAAAACAALeHYmS94y_nTXRFf3KqmZX0h3ym2kx27qZ2jKed8J-8AAA)

Worst-case runtime: O(n * m)

# Exercises: Sorting algorithms

You are allowed to use the linked videos or visualisations - but **not** copy code.

- If you are stuck - look at pseudocode or recreate the algorithm with pen & paper

#### Implement the [selection sort](https://www.youtube.com/watch?v=3hH8kTHFw2A) algorithm with the following elements:

```kotlin
val unsortedNumbers = listOf(29, 15, 8, 47, 63, 22, 56, 31, 74, 19, 33, 41, 52, 60, 10, 88, 92, 38, 45, 17)
```

- Understand the algorithm with pen and paper
- [Visualisation](https://www.youtube.com/watch?v=Iccmrk2ZWoc)


#### Implement the [insertion sort](https://www.youtube.com/watch?v=O0VbBkUvriI) algorithm with the following elements:

```kotlin
val unsortedStrings = listOf(
    "banana", "apple", "orange", "grape", "kiwi", 
    "pineapple", "watermelon", "strawberry", "blueberry", "raspberry", 
    "peach", "pear", "mango", "lemon", "lime", 
    "cherry", "plum", "apricot", "blackberry", "papaya"
)
```

- Understand the algorithm with pen and paper
- [Visualisation](https://youtu.be/JU767SDMDvA?si=3pT2PlxJW48F3wll)


# **Advanced (Optional)**

You are organizing a movie night with your friends, and you've collected a list of movies that everyone wants to watch. However, each person has ranked the movies in their own order of preference. Your task is to create a sorted list of movies that maximizes overall enjoyment for the group.

Here's the challenge:

You're given a list of movie rankings for each person in the group. Each ranking is a list of movie titles, with the first movie being the most preferred and the last movie being the least preferred. Your goal is to create a final list of movies that optimizes the overall satisfaction of the group. This means that the most preferred movies should be at the beginning of the list, and the least preferred movies should be at the end. You can only rearrange the movies within each person's ranking. You cannot change the order of people's rankings or remove/add movies. Write a function that takes in the list of rankings and returns the sorted list of movies.

```kotlin
// Example input
  val rankings = listOf(
      listOf("The Shawshank Redemption", "Inception", "Pulp Fiction"),
      listOf("Inception", "The Shawshank Redemption", "Pulp Fiction"),
      listOf("Pulp Fiction", "The Shawshank Redemption", "Inception")
  )
​
  // Expected output
  val sortedMovies = sortMovies(rankings)
  println(sortedMovies)
```

In this example, "The Shawshank Redemption" is the most preferred movie overall, so it should be at the beginning of the sorted list. "Inception" is the second most preferred movie overall, followed by "Pulp Fiction". The final list maximizes the overall enjoyment for the group.

Your task is to implement the function that achieves this sorting efficiently and accurately.