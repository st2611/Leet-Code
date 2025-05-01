fun plusOne(digits: IntArray): IntArray {
    for (i in digits.size - 1 downTo 0) {
        if (digits[i] < 9) {
            digits[i]++
            return digits
        }
        digits[i] = 0
    }

    val result = IntArray(digits.size + 1)
    result[0] = 1
    return result
}

fun main() {
    val digits = intArrayOf(1,2,8)
    val result = plusOne(digits)
    for (i in result.indices) {
        print("${result[i]} ")
    }
}