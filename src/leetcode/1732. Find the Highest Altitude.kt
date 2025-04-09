package leetcode

import kotlin.math.max

class Solution1723 {

    // Second try
    fun largestAltitude(gain: IntArray): Int {
        var result = 0
        var sumEachIndex = 0
        for(i in 0..gain.size-1){
            sumEachIndex += gain[i]
            result=max(sumEachIndex, result)
        }
        return result
    }


    // First try
    fun largestAltitudeFistTry(gain: IntArray): Int {
        val prefixSum = IntArray(gain.size + 1)
        var highestPoint = 0
        for(i in 1..prefixSum.lastIndex) {
            prefixSum[i] = prefixSum[i - 1] + gain[i - 1]
            if(prefixSum[i] > highestPoint) {
                highestPoint = prefixSum[i]
            }
        }
        return highestPoint
    }
}