package com.example.fromJava

import org.junit.jupiter.api.Test

class `p3_연속된 부분 수열의 합` {
    @Test
    fun test():Unit{

    }

    // k: the sum of subsequences
    // Given the ascending sequence as the parameter
    fun solution(sequence:IntArray, k:Int): IntArray {
        var answer = intArrayOf(0, 0)

        var start = 0
        var end = 0
        var sum = sequence[0]
        var distance = Int.MAX_VALUE

        while(start < sequence.size && end < sequence.size){
            when {
                sum < k && end < sequence.size - 1 ->{
                    end += 1
                    sum += sequence[end]
                }
                sum == k -> {
                    if(end - start < distance){
                        answer[0] = start
                        answer[1] = end
                        distance = end -start
                    }
                    sum -= sequence[start++]
                }
                else -> {
                    sum -= sequence[start++]
                }
            }
        }

        return answer
    }
}