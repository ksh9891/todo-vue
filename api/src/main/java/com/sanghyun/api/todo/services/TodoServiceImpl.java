package com.sanghyun.api.todo.services;

import com.sanghyun.api.todo.model.Todo;
import com.sanghyun.api.todo.repositories.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> retrieveAllTodo() {
        return todoRepository.findAll();
    }

    @Override
    public Todo findByTodo() {
        return null;
    }

    @Override
    public void addTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public Todo updateTodo(Integer id, Todo todo) {
        Todo editTodo = todoRepository.findById(id).get();
        editTodo.setContent(todo.getContent());
        return todoRepository.save(editTodo);
    }

    @Override
    public void deleteTodo(Integer id) {
        todoRepository.deleteById(id);
    }
}
