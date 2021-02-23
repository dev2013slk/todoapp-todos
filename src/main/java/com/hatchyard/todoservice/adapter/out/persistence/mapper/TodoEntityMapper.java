package com.hatchyard.todoservice.adapter.out.persistence.mapper;

import com.hatchyard.todoservice.adapter.out.persistence.entity.TodoEntity;
import com.hatchyard.todoservice.domain.entity.Todo;
import org.springframework.stereotype.Service;

/**
 * TodoEntityMapper
 * All rights reserved.
 * Created by Pc on 2/23/2021
 * Copyright(c) 2021 DirectFN to present.
 */
@Service
public class TodoEntityMapper implements EntityMapper<TodoEntity, Todo> {


    @Override
    public TodoEntity toEntity(Todo todo) {
        new TodoEntity();
        return TodoEntity.builder()
                .todoId(todo.getTodoId())
                .todoName(todo.getTodoName())
                .build();
    }

    @Override
    public Todo toDomain(TodoEntity todoEntity) {
        return Todo.builder()
                .todoId(todoEntity.getTodoId())
                .todoName(todoEntity.getTodoName())
                .build();
    }
}
