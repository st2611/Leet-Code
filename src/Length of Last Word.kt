fun lengthOfLastWord(s: String): Int {
    if (s.isEmpty()) return 0
    var result = 0
    var ind = s.length - 1

    while (ind >= 0 && s[ind] == ' ') ind--
    while (ind >= 0 && s[ind] != ' ') {
        ind--
        result++
    }

    return result
}

fun main() {
    val s = " Hello world "
    println("Result = ${lengthOfLastWord(s)}")
}