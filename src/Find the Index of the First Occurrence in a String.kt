fun strStr(haystack: String, needle: String): Int {
    if (needle.isEmpty()) return 0
    if (haystack.length < needle.length) return -1
    if (!haystack.contains(needle)) return -1

    var result = 0
    var temp = haystack

    while (!temp.startsWith(needle)) {
        temp = temp.drop(1)
        result ++
    }

    return result
}

fun main() {
    val haystack = "leetcode"
    val needle = "leeto"
    println("Result = ${strStr(haystack, needle)}")

}