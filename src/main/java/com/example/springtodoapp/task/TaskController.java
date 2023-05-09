package com.example.springtodoapp.task;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {
  @GetMapping("/")
  public String index(Model model) {
    var tasks = new ArrayList<Task>();
    tasks.add(new Task(null, "Task 1"));
    tasks.add(new Task(null, "Task 2"));

    model.addAttribute("tasks", tasks);
    return "index";
  }
}
