fun romanToInt(s: String): Int {
    var result = 0
    val romanMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    for (i in s.indices) {
        val curr = romanMap[s[i]]!!
        val next = if (i + 1 < s.length) romanMap[s[i + 1]]!! else 0
        if (curr < next) {
            result -= curr
        } else {
            result += curr
        }
    }
    return result
}