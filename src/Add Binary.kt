fun addBinary(a: String, b: String): String {
    var lengthA = a.length
    var lengthB = b.length
    val result = StringBuilder()
    var carry = 0

    while (lengthA > 0 || lengthB > 0 || carry > 0) {
        val bitA = if (lengthA > 0) a[lengthA - 1].digitToInt() else 0
        val bitB = if (lengthB > 0) b[lengthB - 1].digitToInt() else 0
        val sum = bitA + bitB + carry

        lengthA--
        lengthB--
        result.append(sum % 2)
        carry = sum / 2
    }

    return result.reversed().toString()
}

fun main() {
    val a = "1010"
    val b = "1011"
    println("Result = ${addBinary(a, b)}")
}