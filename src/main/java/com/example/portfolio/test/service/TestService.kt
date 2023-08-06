package com.example.portfolio.test.service

import com.example.portfolio.test.dto.TodoDto
import org.springframework.stereotype.Service

@Service
class TestService {
    fun create(): TodoDto{
        return TodoDto("name")
    }
}