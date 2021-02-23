package com.hatchyard.todoservice.todo.application.in;

import com.hatchyard.todoservice.entity.Todo;
import com.hatchyard.todoservice.repository.TodoRepository;
import com.hatchyard.todoservice.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * TodoServiceImpl
 * All rights reserved.
 * Created by lasath on 2/16/2021
 */
@Service
@Slf4j
public class TodoServiceImpl implements TodoService {

    @Autowired
    TodoRepository todoRepository;

    private static final String TOPIC = "my_topic";


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    @Transactional
    public Todo saveTodo(Todo todo) {
        log.info("Inside AssembleTodoUseCase.");

        return todoRepository.save(todo);
    }

    @Override
    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    @Override
    public Todo updateTodo(Todo todo) {
        return todoRepository.save(todo);
    }
}
