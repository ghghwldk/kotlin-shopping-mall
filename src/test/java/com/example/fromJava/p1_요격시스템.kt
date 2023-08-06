package com.example.fromJava

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class p1_요격시스템 {
    @Test
    fun test(): Unit{
        // Initialize parameter
        val targets = arrayOf(
                intArrayOf(1, 5),
                intArrayOf(3, 7),
                intArrayOf(2, 6),
                intArrayOf(8, 10)
        )

        // Process solution
        val result = solution(targets)
    }

    fun solution(targets: Array<IntArray>): Int{
        var answer: Int =0
        print("--targets before changed:")
        targets.forEach{
            it.forEachIndexed { index, element ->
                println("  Element at inner index $index: $element")
            }
        }
        targets.sortBy{
            it[1]
        }
        var destination = -1
        for(target in targets){
            val (s, e) = target
            if(destination < s){
                destination = e-1
                answer++
            }
        }
        return answer
    }
}