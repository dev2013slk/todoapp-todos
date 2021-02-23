package com.hatchyard.todoservice.adapter.out.persistence.repository;

import com.hatchyard.todoservice.entity.TodoCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoCategoryRepository extends JpaRepository<TodoCategory, Long> {
}
