package com.api.controllers;

import com.domain.tasks.handlers.CreateTaskHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final CreateTaskHandler _createTask;

    public TaskController(CreateTaskHandler createTask) {
        _createTask = createTask;
    }
}
