package com.example.fromJava.service

import com.example.fromJava.dto.TodoDto
import org.springframework.stereotype.Service

@Service
class TestService {
    fun create(): TodoDto{
        return TodoDto("name")
    }
}