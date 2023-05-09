package com.example.springtodoapp.task;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Table("tasks")
@AllArgsConstructor
@Getter
public class Task {
  @Id
  private Integer id;
  private String title;
}
