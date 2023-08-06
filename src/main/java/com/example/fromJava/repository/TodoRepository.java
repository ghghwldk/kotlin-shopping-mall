package com.example.fromJava.repository;

import com.example.fromJava.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
}