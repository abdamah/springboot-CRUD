package com.riigsoft.todo.controller;

import com.riigsoft.todo.entity.Todo;
import com.riigsoft.todo.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/todos")
public class TodoController {

    private TodoService todosService;


    public TodoController(TodoService todosService) {
        this.todosService = todosService;
    }

    @GetMapping
    ResponseEntity<List<Todo>> getAllTodos() {
        return ResponseEntity.ok(todosService.getAllTodos());
    }

    @GetMapping("/{id}")
    ResponseEntity<Todo> getTodoById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(todosService.getTodoById(id));
    }

    @PostMapping
    ResponseEntity<Todo> saveTodo(@RequestBody Todo todo) {
        return ResponseEntity.ok(todosService.savTodo(todo));
    }

    @PutMapping("/{id}")
    ResponseEntity<String> updateTodo(@PathVariable("id") Long id, @RequestBody Todo todo) {
        if (todosService.getTodoById(id) != null) {
            todosService.updateTodo(id, todo);
            return ResponseEntity.ok("Tod with id " + id + " updated successfully.");
        }

        return ResponseEntity.ok("Todo with id " + id + " not found.");
    }

    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteTodo(@PathVariable("id") Long id) {
        if (todosService.getTodoById(id) != null) {
            todosService.deleteTodo(id);
            return ResponseEntity.ok("Todo with id " + id + " deleted successfully.");
        }else {

            return ResponseEntity.ok("Todo with id " + id + " not found.");
        }
    }

}
