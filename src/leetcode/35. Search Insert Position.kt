package leetcode

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        var ans = -1
        while(left <= right) {
            val middle = left + (right - left) / 2
            if(nums[middle] == target) {
                return middle
            }
            if(nums[middle] > target) {
                ans = middle
                right = middle - 1
            } else {
                left = middle + 1
            }
        }
        if(ans == -1) {
            return nums.size
        }
        return ans
    }
}