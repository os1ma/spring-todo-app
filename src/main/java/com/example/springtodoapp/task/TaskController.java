package com.example.springtodoapp.task;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {
  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("task", new ArrayList<>());
    return "index";
  }
}
