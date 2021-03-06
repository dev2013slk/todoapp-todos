package com.hatchyard.todoservice.service;

import com.hatchyard.todoservice.entity.Todo;

import java.util.List;

/**
 * TodoService
 * All rights reserved.
 * Created by lasath on 2/16/2021
 */
public interface TodoService {
    Todo saveTodo(Todo todo);

    List<Todo> getTodos();

    Todo updateTodo(Todo todo);
}
