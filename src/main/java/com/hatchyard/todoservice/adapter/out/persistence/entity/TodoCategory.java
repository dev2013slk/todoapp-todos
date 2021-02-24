package com.hatchyard.todoservice.adapter.out.persistence.entity;

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
public class TodoCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "auto_gen", sequenceName = "TODO_CAT_SEQ")
    private Long id;

    private String listName;

    @ManyToOne
    @JoinColumn(name="todo_id", nullable=false)
    private Todo todo;

}

