package com.riigsoft.todo.bootstrap;

import com.riigsoft.todo.entity.Todo;
import com.riigsoft.todo.entity.TodoStatus;
import com.riigsoft.todo.repo.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TodoLoader implements CommandLineRunner {

    private TodoRepository todoRepository;

    public TodoLoader(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadTodos();
    }

    private void loadTodos() {
        if (todoRepository.count() == 0) {
            todoRepository.save(
                    Todo.builder()
                            .title("Go to school")
                            .description("Complete assignment")
                            .todoStatus(TodoStatus.NOT_COMPLETED)
                            .build()
            );
            todoRepository.save(
                    Todo.builder()
                            .title("Go to market")
                            .description("Buy some shoes and t-shirts")
                            .todoStatus(TodoStatus.NOT_COMPLETED)
                            .build()
            );
        }
    }
}
