fun main(args: Array<String>) {
    val konkaHas = 53
    val titlyHas = 36
    var totalBlanket = konkaHas + titlyHas
    var distributedNGO = 0

    var digit1 = 0
    var digit2 = 1
    var sum: Int
    println("Konka has $konkaHas, and Titly has $titlyHas blanket")
    println("Total Blanket: $totalBlanket")
    while (totalBlanket > 0) {
        distributedNGO++
        sum = digit1 + digit2
        if (sum <= totalBlanket) {
            totalBlanket -= sum
        } else {
            sum = totalBlanket
            totalBlanket -= sum
        }
        digit1 = digit2
        digit2 = sum
        println("$distributedNGO No. NGO will get: $sum, Remain: $totalBlanket")
    }

    println("Total NGOs will be helpful: $distributedNGO")
}