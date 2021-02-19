package com.hatchyard.todoservice.repository;

import com.hatchyard.todoservice.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TODORepository
 * All rights reserved.
 * Created by lasath on 2/16/2021
 * Copyright (c) 2017 6willow.com to present.
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
