package com.hatchyard.todoservice.domain.usecase;


import java.util.List;

/**
 * TodoCategoryServiceImpl
 * Created by Lasath Jayawardana
 */
public interface ListUseCase<T> {

    List<T> list(T t);
}
