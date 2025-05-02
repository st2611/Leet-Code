fun mySqrt(x: Int): Int {
    if (x == 0 || x == 1) return x
    var left = 0
    var right = x / 2
    var result = 0

    while (left <= right) {
        val mid = left + (right - left) / 2
        val midSquared = mid.toLong() * mid

        when {
            midSquared == x.toLong() -> return mid
            midSquared < x -> {
                result = mid
                left = mid + 1
            }
            else -> right = mid - 1
        }
    }

    return result
}

fun main() {
    val x = 122
    println("Result = ${mySqrt(x)}")
}