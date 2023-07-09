package com.riigsoft.todo.service;

import com.riigsoft.todo.entity.Todo;
import com.riigsoft.todo.repo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepo;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepo) {
        this.todoRepo = todoRepo;
    }

    @Override
    public List<Todo> getAllTodos() {
        return todoRepo.findAll();
    }

    @Override
    public Todo getTodoById(Long id) {
        return todoRepo.findById(id).get();
    }

    @Override
    public Todo savTodo(Todo todo) {
        return todoRepo.save(todo);
    }

    @Override
    public void updateTodo(Long id, Todo todo) {
        var todoFromDb = todoRepo.findById(id).get();

        todoFromDb.setId(todo.getId());
        todoFromDb.setTitle(todo.getTitle());
        todoFromDb.setDescription(todo.getDescription());
        todoFromDb.setTodoStatus(todo.getTodoStatus());

        todoRepo.save(todoFromDb);

    }

    @Override
    public void deleteTodo(Long id) {
        todoRepo.deleteById(id);
    }
}
