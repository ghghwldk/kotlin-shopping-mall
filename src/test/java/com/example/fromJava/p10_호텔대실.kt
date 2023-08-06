package com.example.fromJava

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class p10_호텔대실 {
    @Test
    public fun test(): Unit{
        // given
        val inputBookTime = arrayOf(
                arrayOf("10:20", "12:30"),
                arrayOf("10:20", "12:30"),
                arrayOf("10:20", "12:30"),
        )

        val result = solution(inputBookTime)
        val expectedOutput = 3
        assertEquals(expectedOutput, result)
    }

    fun solution(book_time: Array<Array<String>>): Int {
        val reserved = mutableListOf<Int>()
        val sorted = book_time.map {
            val start = it[0].substringBefore(":").toInt() * 60
                + it[0].substringAfter(":").toInt()
            val end = it[1].substringBefore(":").toInt() * 60
                + it[1].substringAfter(":").toInt() + 10
            intArrayOf(start, end)
        }.sortedWith(Comparator{
            o1, o2 ->
            if(o1[0] == o2[0]) {
                o1[1].compareTo(o2[0])
            }
            else {
                o1[0].compareTo(o2[0])
            }
        }).toMutableList()

        while(sorted.isNotEmpty()){
            var cur = sorted.removeAt(0)
            if(reserved.isEmpty()){
                reserved.add(cur[1])
            }else{
                val index = reserved.indexOfFirst{
                    it <= cur[0]
                }
                if(index in reserved.indices){
                    reserved[index] = cur[1]
                }else{
                    reserved.add(cur[1])
                }
            }
        }
        return reserved.size
    }
}