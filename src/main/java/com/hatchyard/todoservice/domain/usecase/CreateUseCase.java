package com.hatchyard.todoservice.domain.usecase;


/**
 * CreateUseCase
 * All rights reserved.
 * Created by lasath on 2/16/2021
 */
public interface CreateUseCase<T>  {

    T save(T t);

}
