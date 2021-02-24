package com.hatchyard.todoservice.adapter.out.persistence.mapper;

import com.hatchyard.todoservice.adapter.out.persistence.entity.Todo;
import com.hatchyard.todoservice.domain.entity.TodoDomain;
import org.springframework.stereotype.Service;

/**
 * TodoEntityMapper
 * All rights reserved.
 * Created by Pc on 2/23/2021
 * Copyright(c) 2021 DirectFN to present.
 */
@Service
public class TodoEntityMapper implements EntityMapper<Todo, TodoDomain> {


    @Override
    public Todo toEntity(TodoDomain todoDomain) {
        new Todo();
        return Todo.builder()
                .todoId(todoDomain.getTodoId())
                .todoName(todoDomain.getTodoName())
                .build();
    }

    @Override
    public TodoDomain toDomain(Todo todo) {
        return TodoDomain.builder()
                .todoId(todo.getTodoId())
                .todoName(todo.getTodoName())
                .build();
    }
}
