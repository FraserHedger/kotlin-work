// Task 7.7.1: statistics functions

fun median(data: List<Float>): Float {
    require(data.isNotEmpty())

    val sortedData = data.sorted()
    val middle = sortedData.size / 2

    return if (sortedData.size % 2 == 1) {
        sortedData[middle]
    } else {
        (sortedData[middle - 1] + sortedData[middle]) / 2
    }
}

fun displayStatistics(data: List<Float>) {
    println("Minimum: ${data.min()}")
    println("Maximum: ${data.max()}")
    println("Mean: ${data.average()}")
    println("Median: ${median(data)}")
}
