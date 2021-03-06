package com.springmvc.form.service;

import com.springmvc.form.domain.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo(1, "Gadibia", "Learn Spring MVC", new Date(),
                false));
        todos.add(new Todo(2, "Gadibia", "Learn Struts", new Date(), false));
        todos.add(new Todo(3, "Gadibia", "Learn Hibernate", new Date(),
                false));
    }

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}