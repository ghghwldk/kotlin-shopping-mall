package com.example.portfolio.service

import com.example.portfolio.dto.TodoDto
import org.springframework.stereotype.Service

@Service
class TestService {
    fun create(): TodoDto{
        return TodoDto("name")
    }
}