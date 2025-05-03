fun climbStairs(n: Int): Int {
    if (n <= 2) return n
    var oneStepBefore = 2 // f(2) with n = 3
    var twoStepBefore = 1 // f(1) with n = 3
    var allWays = 0

    for (i in 3..n) {
        allWays = oneStepBefore + twoStepBefore
        oneStepBefore = allWays
        twoStepBefore = oneStepBefore
    }

    return allWays
}
// Dynamic Programming: xây dựng từ nhỏ đến lớn
// oneStepBefore là số cách để leo lên bậc thang (n - 1)
// twoStepsBefore là số cách để leo lên bậc (n - 2)

// f(3) = f(2) + f(1)
// f(4) = f(3) + f(2)

fun main() {
    val n = 45
    println("Result = ${climbStairs(n)}")
}