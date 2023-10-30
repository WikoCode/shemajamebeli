class Math {

    // 1)

    fun GCD(a: Int, b: Int): Int {
        var numberOne = a
        var numberTwo = b

        while (numberTwo != 0) {
            val remainder = numberOne % numberTwo
            numberOne = numberTwo
            numberTwo = remainder
        }

        return numberOne
    }

    // 2)

    fun LCM(a: Int, b: Int): Int {
        val gcd = GCD(a, b)
        return a * b / gcd
    }

}