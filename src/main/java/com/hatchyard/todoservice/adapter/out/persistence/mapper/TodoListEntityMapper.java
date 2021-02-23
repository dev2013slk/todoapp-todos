package com.hatchyard.todoservice.adapter.out.persistence.mapper;

import com.hatchyard.todoservice.adapter.out.persistence.entity.TodoEntity;
import com.hatchyard.todoservice.adapter.out.persistence.entity.TodoListEntity;
import com.hatchyard.todoservice.domain.entity.Todo;
import com.hatchyard.todoservice.domain.entity.TodoList;
import org.springframework.stereotype.Service;

/**
 * TodoEntityMapper
 * All rights reserved.
 * Created by Pc on 2/23/2021
 * Copyright(c) 2021 DirectFN to present.
 */
@Service
public class TodoListEntityMapper implements EntityMapper<TodoListEntity, TodoList> {


    @Override
    public TodoListEntity toEntity(TodoList obj) {
        return TodoListEntity.builder()
                .listId(obj.getListId())
                .listName(obj.getListName())
                .build();
    }

    @Override
    public TodoList toDomain(TodoListEntity entity) {
        return TodoList.builder()
                .listId(entity.getListId())
                .listName(entity.getListName())
                .build();
    }
}
