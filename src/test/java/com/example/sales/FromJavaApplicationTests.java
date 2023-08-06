package com.example.sales;

import com.example.sales.entity.TodoEntity;
import com.example.sales.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FromJavaApplicationTests {
	@Autowired private TodoRepository todoRepository;

	@Test
	void contextLoads() {
		List<TodoEntity> todoEntities
				= todoRepository.findAll();
		todoEntities = todoEntities;
	}

}
