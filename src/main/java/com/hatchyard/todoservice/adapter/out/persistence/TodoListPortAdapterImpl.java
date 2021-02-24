package com.hatchyard.todoservice.adapter.out.persistence;

import com.hatchyard.todoservice.adapter.out.persistence.entity.TodoCategory;
import com.hatchyard.todoservice.adapter.out.persistence.mapper.TodoListEntityMapper;
import com.hatchyard.todoservice.adapter.out.persistence.repository.TodoListRepository;
import com.hatchyard.todoservice.domain.entity.TodoCategoryDomain;
import com.hatchyard.todoservice.domain.port.TodoListPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TodoPortImpl
 * All rights reserved.
 * Created by Pc on 2/24/2021
 * Copyright(c) 2021 DirectFN to present.
 */
@Service
public class TodoListPortAdapterImpl implements TodoListPort {

    @Autowired
    TodoListRepository todoListRepository;

    @Autowired
    TodoListEntityMapper entityMapper;

    @Override
    public TodoCategoryDomain createTodoList(TodoCategoryDomain obj) {
        TodoCategory entity  = entityMapper.toEntity(obj);
        return entityMapper.toDomain(todoListRepository.save(entity));
    }
}
