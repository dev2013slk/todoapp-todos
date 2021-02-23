package com.hatchyard.todoservice.domain.usecase.todolist.impl;

import com.hatchyard.todoservice.adapter.out.persistence.repository.TodoRepository;
import com.hatchyard.todoservice.domain.entity.Todo;
import com.hatchyard.todoservice.domain.entity.TodoList;
import com.hatchyard.todoservice.domain.port.TodoListPort;
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
public class CreateUseCaseImpl implements CreateUseCase<TodoList> {




    @Autowired
    TodoRepository todoRepository;

    @Autowired
    TodoListPort todoListPort;


    @Override
    public TodoList save(TodoList todoList) {


        return todoListPort.createTodoListPort(todoList);
    }
}
