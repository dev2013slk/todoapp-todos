package com.hatchyard.todoservice.domain.port;

import com.hatchyard.todoservice.domain.entity.TodoDomain;

/**
 * TodoPort
 * All rights reserved.
 * Created by Pc on 2/24/2021
 * Copyright(c) 2021 DirectFN to present.
 */
public interface TodoPort {
    TodoDomain createTodoPort(TodoDomain todoDomain);
}
