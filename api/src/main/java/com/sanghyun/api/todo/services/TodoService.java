package com.sanghyun.api.todo.services;

import com.sanghyun.api.todo.model.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    List<Todo> retrieveAllTodo();

    Todo findByTodo();

    void addTodo(Todo todo);

    Todo updateTodo(Integer id, Todo todo);

    void deleteTodo(Integer id);
}