package com.hatchyard.todoservice.domain.usecase.todolist.impl;

import com.hatchyard.todoservice.adapter.out.persistence.repository.TodoRepository;
import com.hatchyard.todoservice.domain.entity.TodoCategoryDomain;
import com.hatchyard.todoservice.domain.port.TodoListPort;
import com.hatchyard.todoservice.domain.usecase.CreateUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create
 * All rights reserved.
 * Created by Pc on 2/23/2021
 * Copyright(c) 2021 DirectFN to present.
 */
@Service
@Slf4j
public class TodoListCreateUseCaseImpl implements CreateUseCase<TodoCategoryDomain> {




    @Autowired
    TodoRepository todoRepository;

    @Autowired
    TodoListPort todoListPort;


    @Override
    public TodoCategoryDomain save(TodoCategoryDomain todoCategoryDomain) {

        log.info("##### TodoListCreateUseCaseImpl " + todoCategoryDomain);
        return todoListPort.createTodoList(todoCategoryDomain);
    }
}
