class Day3 {

    fun divide(
        dividend: Int,
        divisor: Int,
        onSuccess: (Int) -> Unit,
        onZeroError: (String) -> Unit
    ) {
        if (divisor == 0 && dividend > 0) {
            onZeroError("Zero Error")
        } else {
            onSuccess(dividend / divisor)
        }
    }
}

fun main() {
    val divide: Day3 = Day3()
    divide.divide(12, 0,
        { println(it) },
        {println(it) })
}