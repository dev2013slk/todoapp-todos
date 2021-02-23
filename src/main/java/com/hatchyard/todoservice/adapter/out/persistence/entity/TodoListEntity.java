package com.hatchyard.todoservice.adapter.out.persistence.entity;

import com.hatchyard.todoservice.domain.entity.Todo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * TodoCategoryServiceImpl
 * Created by Lasath Jayawardana
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoListEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen")
    @SequenceGenerator(name = "auto_gen", sequenceName = "TODO_SEQ")
    private Long listId;

    private String listName;

    @ManyToOne
    @JoinColumn(name="todo_id", nullable=false)
    private Todo todo;

}

