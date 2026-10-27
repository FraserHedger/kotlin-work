// Task 7.7.1: program to compute stats for a numeric dataset
fun main(args: Array<String>){
    require(args.size == 1)
    {
        "Invalid"
    }

    val data = readData(args[0])
    displayStatistics(data)
}