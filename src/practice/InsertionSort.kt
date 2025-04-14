package practice

fun main() {
    val insertionSort = InsertionSort()
    insertionSort.execute(listOf(6,5,3,1,8,7,2,4).toIntArray())
}

class InsertionSort {
    // 6 5 3 1 8 7 2 4
    fun execute(nums: IntArray): IntArray {
        for (i in 1..<nums.size) {
            var j = i
            while(j > 0) {
                val temp = nums[j - 1]
                if(nums[j] < temp) {
                    nums[j - 1] = nums[j]
                    nums[j] = temp
                    println(nums.contentToString())
                } else {
                    break
                }
                j--
            }
        }
        return nums
    }
}