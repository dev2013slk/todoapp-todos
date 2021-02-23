package com.hatchyard.todoservice.todo.application.usecase;

import com.hatchyard.todoservice.entity.TodoCategory;

/**
 * TodoCategoryServiceImpl
 * Created by Lasath Jayawardana
 */
public interface TodoCategoryService {
    TodoCategory saveTodoCategory(TodoCategory todoCategory);
}
