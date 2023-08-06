package com.example.fromJava

class p11_무인도여행 {
    var tempF = 0
    val dx: List<Int> = listOf(0,0,1,-1)
    val dy: List<Int> = listOf(1,-1,0,0)
    lateinit var visited: Array<Array<Boolean>>
    fun solution(maps: Array<String>):IntArray{
        var answer: IntArray = intArrayOf()
        val answerList = mutableListOf<Int>()
        visited = Array(maps.size){
                Array(maps[0].length){false
            }
        }

        for (i in 0 until maps.size){
            for(j in 0..maps[0].length-1){
                if(!visited[i][j] && maps[i][j] != 'X'){
                    tempF = 0
                    dfs(i, j, maps)
                    answerList.add(tempF)
                }
            }
        }

        answerList.sort()
        if(answerList.isEmpty()){
            return intArrayOf(-1)
        }else{
            return answerList.toIntArray()
        }
    }

    fun dfs(x: Int, y: Int, maps: Array<String>){
        visited[x][y] = true
        tempF += maps[x][y].digitToInt()
        for(i in 0 until 4){
            try{
                if(!visited[x+dx[i]][y+dy[i]] && maps[x+dx[i]][y+dy[i]] != 'X')
                    dfs(x+dx[i], y+dy[i], maps)
            }catch (e: Exception){
            }
        }
    }
}