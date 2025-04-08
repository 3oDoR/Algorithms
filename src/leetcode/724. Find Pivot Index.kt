package leetcode

class Solution724 {
    // 1, 7, 3, 6, 5, 6,
    // 0, 1, 8, 11, 17, 22, 28

    fun pivotIndex(nums: IntArray): Int {

        val prefixSum = IntArray(nums.size + 1)
        for(i in 1..prefixSum.lastIndex) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1]
        }

        for (i in 0..nums.size - 1) {
            val total = prefixSum[prefixSum.lastIndex] - prefixSum[i] - nums[i]
            if (total == prefixSum[i]) {
                return i
            }
        }
        return -1
    }
}