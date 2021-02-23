package com.hatchyard.todoservice.todo.adapter.out.persistence.entity;

import com.hatchyard.todoservice.todo.domain.Todo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * TodoCategoryServiceImpl
 * Created by Lasath Jayawardana
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen")
    @SequenceGenerator(name = "auto_gen", sequenceName = "TODO_SEQ")
    private Long categoryId;

    private String categoryName;

    @ManyToOne
    @JoinColumn(name="todo_id", nullable=false)
    private Todo todo;

}

