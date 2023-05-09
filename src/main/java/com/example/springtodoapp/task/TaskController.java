package com.example.springtodoapp.task;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

  @PostMapping("/tasks")
  public String create(@RequestParam String title) {
    var task = new Task(null, title);
    taskService.register(task);
    return "redirect:/";
  }
}
