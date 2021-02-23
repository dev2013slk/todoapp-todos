package com.hatchyard.todoservice.todo.adapter.out.persistence;

import com.hatchyard.todoservice.entity.Todo;
import com.hatchyard.todoservice.entity.TodoCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TodoEntityAdapter
 * All rights reserved.
 * Created by Lasath on 2/23/2021
 * Copyright(c) 2021 DirectFN to present.
 */
@Service
public interface TodoCategoryEntityAdapter {

    /**
     * This method used to persit {@link com.hatchyard.todoservice.entity.TodoCategory} entity.
     * @param todoCategory
     * @return
     */
    Todo saveTodo(TodoCategory todoCategory);

    /**
     * This method used to list all the {@link com.hatchyard.todoservice.entity.TodoCategory} entities.
     * @return
     */
    List<TodoCategory> listTodos();

    /**
     * This method used to update {@link com.hatchyard.todoservice.entity.TodoCategory} entity.
     * @param todoCategory
     * @return
     */
    Todo updateTodo(TodoCategory todoCategory);

    /**
     * This method used to delete {@link com.hatchyard.todoservice.entity.TodoCategory} from the DB.
     * @param todoCategory
     */
    void deleteTodo(TodoCategory todoCategory);

}
