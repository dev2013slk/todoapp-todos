package com.hatchyard.todoservice.adapter.in.web.todo;

import com.hatchyard.todoservice.domain.entity.Todo;
import com.hatchyard.todoservice.domain.usecase.todo.impl.CreateUseCaseImpl;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CreateController
 * All rights reserved.
 * Created by Pc on 2/23/2021
 * Copyright(c) 2021 DirectFN to present.
 */
@Slf4j
@RestController
@RequestMapping("/todos")
public class CreateController {

    @Autowired
    CreateUseCaseImpl createUseCase;


    @Operation(summary = "Crate a new TODO")
    @PostMapping("/")
    public Todo saveTodo(@RequestBody Todo todo) {
        log.info("Inside TODOController " + todo);
        return createUseCase.save(todo);
    }

}
