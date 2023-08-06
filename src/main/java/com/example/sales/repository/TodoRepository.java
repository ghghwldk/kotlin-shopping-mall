package com.example.sales.repository;

import com.example.sales.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
}