package com.riigsoft.todo.service;

import com.riigsoft.todo.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodos();
    Todo getTodoById(Long id);
    Todo savTodo(Todo todo);
    void updateTodo(Long id, Todo todo);
    void deleteTodo(Long id);
}
