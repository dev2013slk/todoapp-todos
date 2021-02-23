package com.hatchyard.todoservice.adapter.out.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Todo
 * All rights reserved.
 * Created by lasath on 2/16/2021
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen")
    @SequenceGenerator(name = "auto_gen", sequenceName = "TODO_SEQ")
    private Long todoId;

    private String todoName;

    @OneToMany(mappedBy = "todo")
    private List<TodoListEntity> todoCategories;

}
