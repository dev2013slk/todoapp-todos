package com.hatchyard.todoservice.adapter.out.persistence.repository;

import com.hatchyard.todoservice.adapter.out.persistence.entity.TodoCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository extends JpaRepository<TodoCategory, Long> {
}
