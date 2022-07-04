package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
  private Logger logger = LoggerFactory.getLogger(getClass());
  private static List<Todo> todos = new ArrayList<>();
  private static int todosCount = 0;
  static {
    todos.add(new Todo(++todosCount, "in28minutes", "Learn Full Stack Java Cource", LocalDate.now().plusYears(1), false));
    todos.add(new Todo(++todosCount, "in28minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
    todos.add(new Todo(++todosCount, "in28minutes", "Learn Functional Programming", LocalDate.now().plusYears(1), false));
    todos.add(new Todo(++todosCount, "in28minutes", "Learn CI/CD using Jenkins", LocalDate.now().plusYears(1), false));
    todos.add(new Todo(++todosCount, "in28minutes", "Learn Kubenates", LocalDate.now().plusYears(1), false));
  }

  public List<Todo> findByUsername(String username) {

    Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
    return todos.stream().filter(predicate).toList();
  }

  public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
    todos.add(new Todo(++todosCount, username, description, targetDate, done));
  }

  public void deleteById(int id) {
    // todo.getId() == id
    // todo -> todo.getId() == id
    Predicate<? super Todo> filter = todo -> todo.getId() == id;
    todos.removeIf(filter);
  }

  public Todo findById(int id) {
    Predicate<? super Todo> predicate = todo -> todo.getId() == id;
    return todos.stream().filter(predicate).findFirst().get();
  }

  public void updateTodo(@Valid Todo todo) {
    deleteById(todo.getId());
    todos.add(todo);
    logger.debug("todos: {}", todos);
  }

}
