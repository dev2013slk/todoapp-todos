package com.hatchyard.todoservice.adapter.out.persistence;

import com.hatchyard.todoservice.adapter.out.persistence.entity.TodoEntity;
import com.hatchyard.todoservice.adapter.out.persistence.mapper.TodoEntityMapper;
import com.hatchyard.todoservice.adapter.out.persistence.repository.TodoRepository;
import com.hatchyard.todoservice.domain.entity.Todo;
import com.hatchyard.todoservice.domain.port.TodoPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TodoPortImpl
 * All rights reserved.
 * Created by Pc on 2/24/2021
 * Copyright(c) 2021 DirectFN to present.
 */
@Service
public class TodoPortAdapterImpl implements TodoPort {

    @Autowired
    TodoRepository  todoRepository;

    @Autowired
    TodoEntityMapper todoEntityMapper;

    @Override
    public Todo createTodoPort(Todo todo) {
        TodoEntity todoEntity  = todoEntityMapper.toEntity(todo);
        return todoEntityMapper.toDomain(todoRepository.save(todoEntity));
    }
}