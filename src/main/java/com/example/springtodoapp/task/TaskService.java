package com.example.springtodoapp.task;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TaskService {
  private TaskRepository taskRepository;

  public Iterable<Task> findAll() {
    return taskRepository.findAll();
  }

  public void register(Task task) {
    taskRepository.save(task);
  }
}
