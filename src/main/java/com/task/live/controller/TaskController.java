package com.task.live.controller;

import com.task.live.dto.TaskDto;
import com.task.live.service.TaskServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = ("/api/task"))
public class TaskController implements TaskApi {
    private final TaskServiceImpl taskService;

    @Override
    public TaskDto save(TaskDto request) {
        return taskService.addTask(request);
    }
}
