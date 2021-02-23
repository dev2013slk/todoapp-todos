package com.hatchyard.todoservice.domain.usecase;


import com.hatchyard.todoservice.domain.entity.Todo;

import java.util.List;

/**
 * CreateUseCase
 * All rights reserved.
 * Created by lasath on 2/16/2021
 */
public interface UpdateUseCase<T> {

    T update(T t);

}
