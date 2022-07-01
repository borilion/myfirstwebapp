package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
  private static List<Todo> todos = new ArrayList<>();
  static {
    todos.add(new Todo(1, "in28minutes", "Learn Full Stack Java Cource", LocalDate.now().plusYears(1), false));
    todos.add(new Todo(2, "in28minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
    todos.add(new Todo(3, "in28minutes", "Learn Functional Programming", LocalDate.now().plusYears(1), false));
    todos.add(new Todo(4, "in28minutes", "Learn CI/CD using Jenkins", LocalDate.now().plusYears(1), false));
    todos.add(new Todo(5, "in28minutes", "Learn Kubenates", LocalDate.now().plusYears(1), false));
  }

  public List<Todo> findByUsername(String username) {
    return todos;
  }
}
