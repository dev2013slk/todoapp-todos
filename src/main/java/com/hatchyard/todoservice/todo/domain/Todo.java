package com.hatchyard.todoservice.todo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Todo
 * All rights reserved.
 * Created by lasath on 2/16/2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

/*    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen")
    @SequenceGenerator(name = "auto_gen", sequenceName = "TODO_SEQ")*/
    private Long todoId;

    private String todoName;

    private List<TodoCategory> todoCategories;

}
