fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    val resultado = twoSum(nums, target)

    println("Índices encontrados: ${resultado.joinToString()}")
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}