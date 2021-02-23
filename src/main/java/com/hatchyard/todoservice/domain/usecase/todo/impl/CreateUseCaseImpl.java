package com.hatchyard.todoservice.domain.usecase.todo.impl;

import com.hatchyard.todoservice.adapter.out.persistence.repository.TodoRepository;
import com.hatchyard.todoservice.domain.entity.Todo;
import com.hatchyard.todoservice.domain.port.TodoPort;
import com.hatchyard.todoservice.domain.usecase.CreateUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create
 * All rights reserved.
 * Created by Pc on 2/23/2021
 * Copyright(c) 2021 DirectFN to present.
 */
@Service
public class CreateUseCaseImpl implements CreateUseCase<Todo> {




    @Autowired
    TodoRepository todoRepository;

    @Autowired
    TodoPort todoPort;


    @Override
    public Todo save(Todo todo) {


        return todoPort.createTodoPort(todo);
    }
}
