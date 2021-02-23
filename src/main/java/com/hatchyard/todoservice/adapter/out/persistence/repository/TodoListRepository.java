package com.hatchyard.todoservice.adapter.out.persistence.repository;

import com.hatchyard.todoservice.adapter.out.persistence.entity.TodoListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository extends JpaRepository<TodoListEntity, Long> {
}
