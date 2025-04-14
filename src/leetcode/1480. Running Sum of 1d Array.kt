package leetcode

class Solution1480 {
    fun runningSum(nums: IntArray): IntArray {
        for(i in 1..<nums.size) {
            nums[i] += nums[i - 1]
        }
        return nums
    }

}