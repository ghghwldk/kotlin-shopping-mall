package com.example.sales.initializer;

import com.example.sales.entity.TodoEntity;
import com.example.sales.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;


@Component
@RequiredArgsConstructor
public class DataInitailizer {
    private final Logger logger = LoggerFactory.getLogger(DataInitailizer.class);
    private final TodoRepository todoRepository;
    @PostConstruct
    public void initialize() {
        runFirst();
        runSecond();
    }

    @Transactional
    public void runFirst(){
        logger.info("Data initialization started.");
        TodoEntity entity = TodoEntity.builder()
                .name("name1")
                .build();
        List<TodoEntity> todoEntityList = new LinkedList<>();
        todoEntityList.add(entity);

        todoRepository.saveAll(todoEntityList);

        logger.info("Data initialization finished.");
    }

    public void runSecond(){
        List<TodoEntity> todoEntities = todoRepository.findAll();
        todoEntities = todoEntities;
    }
}
