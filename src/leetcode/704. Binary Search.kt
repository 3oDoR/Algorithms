package leetcode

class Solution704 {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        var middle: Int

        while (right >= left) {
            middle = left + (right - left) / 2
            if (nums[middle] == target) {
                return middle
            }
            if (nums[middle] > target) {
                right = middle - 1
            } else {
                left = middle + 1
            }
        }
        return -1
    }
}