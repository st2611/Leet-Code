fun searchInsert(nums: IntArray, target: Int): Int {
    if (nums.isEmpty()) return 0
    if (nums[0] > target) return 0

    for (i in nums.indices) {
        if (nums[i] == target || nums[i] > target) {
            return i
        }
    }
    return nums.size
}

fun main() {
    val nums = intArrayOf(1,3,5,6)
    val target = 7
    println("Result = ${searchInsert(nums, target)}")
}