package com.example.sales.service

import com.example.sales.dto.TodoDto
import org.springframework.stereotype.Service

@Service
class TestService {
    fun create(): TodoDto{
        return TodoDto("name")
    }
}