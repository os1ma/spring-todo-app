package com.example.springtodoapp.task;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
  public List<Task> findAll() {
    return List.of(
        new Task(null, "Task 1"),
        new Task(null, "Task 2"));
  }
}
