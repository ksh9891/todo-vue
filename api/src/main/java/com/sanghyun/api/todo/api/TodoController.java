package com.sanghyun.api.todo.api;

import com.sanghyun.api.todo.model.Todo;
import com.sanghyun.api.todo.services.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo")
    public ResponseEntity<List<Todo>> getAllTodo() {
        return ResponseEntity.ok(todoService.retrieveAllTodo());
    }

    @PostMapping("/todo")
    public void addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
    }

    @PatchMapping("/todo/{id}")
    public ResponseEntity<Todo> editTodo(@PathVariable("id") Integer id, @RequestBody Todo todo) {
        return ResponseEntity.ok(todoService.updateTodo(id, todo));
    }

    @DeleteMapping("/todo/{id}")
    public void deleteTodo(@PathVariable("id") Integer id) {
        todoService.deleteTodo(id);
    }
}
