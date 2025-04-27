fun removeElement(nums: IntArray, `val`: Int): Int {
    if (nums.isEmpty()) return 0
    var k = 0
    for (i in nums.indices) {
        if (nums[i] != `val`) {
            val temp = nums[i]
            nums[i] = nums[k]
            nums[k] = temp
            k++
        }
    }

    for (i in 0..k) {
        println("${nums[i]}")
    }
    return k
}

fun main() {
    val nums = intArrayOf(3, 2, 2, 3)
    println()
    removeElement(nums, 3)
}