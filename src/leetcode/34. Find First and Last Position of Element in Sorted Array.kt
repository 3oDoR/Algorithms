package leetcode

class Solution34 {

    // [ 2, 5, 6, 7, 8, 8, 8, 15 ]      target = 8
    // [ 2, 2, 2, 2, 5, 6, 7, 15 ]      target = 3
    // [ 2, 5, 6, 7, 15 ]      target = 3

    fun searchRange(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        result[0] = leftBoundary(nums, target)
        result[1] = rightBoundary(nums, target)
        return result
    }

    fun leftBoundary(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex
        var ans = -1
        while (left <= right) {
            val middle = left + (right - left) / 2
            if (nums[middle] > target) {
                right = middle - 1
            } else if (nums[middle] < target) {
                left = middle + 1
            } else {
                ans = middle
                right = middle - 1
            }

        }
        return ans
    }

    fun rightBoundary(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex
        var ans = -1
        while (left <= right) {
            val middle = left + (right - left) / 2
            if (nums[middle] > target) {
                right = middle - 1
            } else if (nums[middle] < target) {
                left = middle + 1
            } else {
                ans = middle
                left = middle + 1
            }
        }

        return ans
    }
}