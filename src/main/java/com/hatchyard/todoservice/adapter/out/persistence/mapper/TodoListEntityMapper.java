package com.hatchyard.todoservice.adapter.out.persistence.mapper;

import com.hatchyard.todoservice.adapter.out.persistence.entity.TodoCategory;
import com.hatchyard.todoservice.domain.entity.TodoCategoryDomain;
import org.springframework.stereotype.Service;

/**
 * TodoEntityMapper
 * All rights reserved.
 * Created by Pc on 2/23/2021
 * Copyright(c) 2021 DirectFN to present.
 */
@Service
public class TodoListEntityMapper implements EntityMapper<TodoCategory, TodoCategoryDomain> {


    @Override
    public TodoCategory toEntity(TodoCategoryDomain obj) {
        return TodoCategory.builder()
                .id(obj.getListId())
                .listName(obj.getListName())
                .build();
    }

    @Override
    public TodoCategoryDomain toDomain(TodoCategory entity) {
        return TodoCategoryDomain.builder()
                .listId(entity.getId())
                .listName(entity.getListName())
                .build();
    }
}
