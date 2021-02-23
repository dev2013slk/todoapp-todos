package com.hatchyard.todoservice.todo.adapter.out.persistence;

import com.hatchyard.todoservice.entity.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TodoEntityAdapter
 * All rights reserved.
 * Created by Lasath on 2/23/2021
 * Copyright(c) 2021 DirectFN to present.
 */
@Service
public interface TodoEntityAdapter {

    /**
     * This method used to persit todo entity.
     * @param todo
     * @return
     */
    Todo saveTodo(Todo todo);

    /**
     * This method used to list all the {@link Todo} entities.
     * @return
     */
    List<Todo> listTodos();

    /**
     * This method used to update {@link Todo} entity.
     * @param todo
     * @return
     */
    Todo updateTodo(Todo todo);

    /**
     * This method used to delete {@link Todo} from the DB.
     * @param todo
     */
    void deleteTodo(Todo todo);

}
