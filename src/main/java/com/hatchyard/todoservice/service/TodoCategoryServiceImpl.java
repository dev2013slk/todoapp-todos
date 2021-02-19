package com.hatchyard.todoservice.service;

import com.hatchyard.todoservice.entity.TodoCategory;
import com.hatchyard.todoservice.repository.TodoCategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TodoCategoryServiceImpl
 * Created by Lasath Jayawardana
 */
@Service
@Slf4j
public class TodoCategoryServiceImpl implements TodoCategoryService {


    @Autowired
    TodoCategoryRepository todoCategoryRepository;

    @Override
    public TodoCategory saveTodoCategory(TodoCategory todoCategory) {
        return todoCategoryRepository.save(todoCategory);
    }
}
