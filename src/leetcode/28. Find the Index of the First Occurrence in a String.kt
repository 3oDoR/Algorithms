package leetcode

class Solution28 {

    // sadbutsad  sad
    // sadbutsad  bud
    // satbutsad  sad
    // sadbutsad  s

    fun strStr(haystack: String, needle: String): Int {
        var firstIndex = -1

        if (needle.length > haystack.length) {
            return firstIndex
        }

        for (i in haystack.indices) {
            if (haystack[i] == needle[0]) {
                val rightHaystackIndex = i + needle.lastIndex
                if (rightHaystackIndex <= haystack.lastIndex) {
                    if (haystack[rightHaystackIndex] == needle[needle.length - 1]) {
                        var firstNeedleIndex = 0
                        for (j in i..rightHaystackIndex) {
                            if (haystack[j] == needle[firstNeedleIndex]) {
                                firstNeedleIndex++
                            } else {
                                break
                            }
                            if (j == rightHaystackIndex) {
                                return i
                            }
                        }
                    }
                }
            }
        }
        return -1
    }
}