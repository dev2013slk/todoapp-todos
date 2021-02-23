package com.hatchyard.todoservice.domain.port;

import com.hatchyard.todoservice.domain.entity.Todo;
import com.hatchyard.todoservice.domain.entity.TodoList;

/**
 * TodoPort
 * All rights reserved.
 * Created by Pc on 2/24/2021
 * Copyright(c) 2021 DirectFN to present.
 */
public interface TodoListPort {
    TodoList createTodoList(TodoList todoList);
}