fun main() {
    val math = Math()

    println("Enter the first number: ")
    val inputOne = readLine()!!.toInt()

    println("Enter the second number: ")
    val inputTwo = readLine()!!.toInt()

    val resultGCD = math.GCD(inputOne, inputTwo)
    println("GCD is : $resultGCD")

    val resultLCM = math.LCM(inputOne, inputTwo)
    println("LCM is : $resultLCM ")

    println("Let's see if your string contains a \$ sign:") // Use \$ to escape the dollar sign
    val inputString: String? = readLine()

    if (inputString != null) {
        val containsDollar = containsDollarSign(inputString)
        println("The input string contains a dollar sign: $containsDollar")
    }

    countEvenNumbersAndSum()

    println("Lets reverse your integer : ")
    reverseInteger()



}

// 3)
fun containsDollarSign(data: String): Boolean {
    return data.contains('$')

}

//4
fun countEvenNumbersAndSum(): Pair<Int, Int> {
    var n = 0
    var sum = 0

    while (n <= 100) {
        if (n % 2 == 0) {
            sum += n
        }
        n++
    }

    return Pair(n - 1, sum)
}

//5
fun reverseInteger(){
    val userNumber = readLine()?.toInt()
    if (userNumber != null) {
        if (userNumber % 10 == 0) {
            println("Reverse of your number is ${userNumber.toString().dropLast(1).reversed()}")
        }
        else
            println("Reverse of your number is ${userNumber.toString().reversed()}")

    }


//6
fun polyndromeChecker() {
    val polyndromeChecker: String? = readLine()
    if (polyndromeChecker != null) {
        if (polyndromeChecker.isBlank()) {
            println("Insert a valid string")
        }
        else if (polyndromeChecker == polyndromeChecker.reversed())
            println("$polyndromeChecker and ${polyndromeChecker.reversed()} are NOT polyndromes")
        else {
            println("$polyndromeChecker and ${polyndromeChecker.reversed()} ARE polyndromes")
        }
    }
}


}
