package com.hatchyard.todoservice.todo.application.usecase;

import com.hatchyard.todoservice.entity.Todo;

import java.util.List;

/**
 * AssembleTodoUseCase
 * All rights reserved.
 * Created by lasath on 2/16/2021
 */
public interface FilterTodoUseCase {
    Todo saveTodo(Todo todo);

    List<Todo> getTodos();

    Todo updateTodo(Todo todo);
}
