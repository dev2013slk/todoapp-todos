package com.hatchyard.todoservice.controller;

import com.hatchyard.todoservice.entity.TodoCategory;
import com.hatchyard.todoservice.service.TodoCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TodoCategoryServiceImpl
 * Created by Lasath Jayawardana
 */
@RestController
@Slf4j
@RequestMapping("/categories")
public class TodoCategoryController {

    @Autowired
    TodoCategoryService todoCategoryService;

    @PostMapping("/")
    public TodoCategory saveCategory(@RequestBody TodoCategory todoCategory){

        return todoCategoryService.saveTodoCategory(todoCategory);
    }

}
