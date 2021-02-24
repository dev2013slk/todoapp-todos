package com.hatchyard.todoservice.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TodoCategoryServiceImpl
 * Created by Lasath Jayawardana
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoCategoryDomain {


    private Long listId;

    private String listName;

    private TodoDomain todoDomain;

}

