package leetcode

/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

// [true, true, true, true, true, false, false, false, false]

class Solution278 : VersionControl() {
    override fun firstBadVersion(n: Int): Int {
        var left = 1
        var right = n
        var ans = 1
        while (left <= right) {
            val middle = left + (right - left) / 2
            if (!isBadVersion(middle)) {
                left = middle + 1
            } else {
                ans = middle
                right = middle - 1
            }
        }
        return ans
    }
}

open class VersionControl {
    fun isBadVersion(n: Int): Boolean {
        TODO("Not yet implemented")
    }

    open fun firstBadVersion(n: Int): Int {
        TODO("Not yet implemented")
    }
}
