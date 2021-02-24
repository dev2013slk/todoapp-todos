package com.hatchyard.todoservice.domain.usecase.todo.impl;

import com.hatchyard.todoservice.adapter.out.persistence.repository.TodoRepository;
import com.hatchyard.todoservice.domain.entity.TodoDomain;
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
public class TodoCreateUseCaseImpl implements CreateUseCase<TodoDomain> {




    @Autowired
    TodoRepository todoRepository;

    @Autowired
    TodoPort todoPort;


    @Override
    public TodoDomain save(TodoDomain todoDomain) {


        return todoPort.createTodoPort(todoDomain);
    }
}
