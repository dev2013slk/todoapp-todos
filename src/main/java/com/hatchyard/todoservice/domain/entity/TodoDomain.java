package com.hatchyard.todoservice.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * TodoDomain
 * All rights reserved.
 * Created by lasath on 2/16/2021
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoDomain {


    private Long todoId;

    private String todoName;

    private List<TodoCategoryDomain> todoCategories;

}
