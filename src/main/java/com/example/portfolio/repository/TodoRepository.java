package com.example.portfolio.repository;

import com.example.portfolio.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
}