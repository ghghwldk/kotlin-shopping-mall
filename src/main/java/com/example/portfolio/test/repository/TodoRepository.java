package com.example.portfolio.test.repository;

import com.example.portfolio.test.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
}