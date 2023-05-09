package com.example.springtodoapp.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class TaskController {
  private TaskService taskService;

  @GetMapping("/")
  public String index(Model model) {
    var tasks = taskService.findAll();
    model.addAttribute("tasks", tasks);
    return "index";
  }
}
