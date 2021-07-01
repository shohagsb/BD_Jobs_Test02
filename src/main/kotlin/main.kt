fun main(args: Array<String>) {
    val konkaHas = 53
    val titlyHas = 36
    var totalBlanket = konkaHas + titlyHas
    var distributedNGO = 0

    var t1 = 0
    var t2 = 1
    var sum: Int
    println("Konka has $konkaHas, and Titly has $titlyHas blanket")
    println("Total Blanket: $totalBlanket")
    while (totalBlanket > 0) {
        distributedNGO++
        sum = t1 + t2
        if (sum <= totalBlanket) {
            totalBlanket -= sum
        } else {
            sum = totalBlanket
            totalBlanket -= sum
        }

        t1 = t2
        t2 = sum
        println("$distributedNGO No. NGO will get: $sum, Remain: $totalBlanket")
    }

    println("Total NGOs can be helped: $distributedNGO")
}