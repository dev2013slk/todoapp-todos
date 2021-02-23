package com.hatchyard.todoservice.todo.adapter.in.web.create;

import com.hatchyard.todoservice.entity.Todo;
import com.hatchyard.todoservice.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

/**
 * TODOController
 * All rights reserved.
 * Created by lasath on 2/16/2021
 */
@Slf4j
@RestController
@RequestMapping(path = {"/todos"}, produces = APPLICATION_JSON_VALUE)
public class CreateTodoController {

    @Autowired
    TodoService todoService;

    @Operation(summary = "Crate a new TODO")
    @PostMapping("/")
    public Todo saveTodo(@RequestBody Todo todo){
        log.info("Inside TODOController " + todo);
        return todoService.saveTodo(todo);
    }

    @Operation(summary = "Load all TODO's")
    @GetMapping("/")
    public List<Todo> todoList(){
        return todoService.getTodos();
    }

    public Todo updateTodo(@RequestBody Todo todo){

        return todoService.updateTodo(todo);

    }



}
