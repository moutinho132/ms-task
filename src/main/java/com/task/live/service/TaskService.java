package com.task.live.service;

import com.task.live.dto.TaskDto;

import java.util.List;

public interface TaskService {
    TaskDto addTask(TaskDto task);
    TaskDto updateTask(TaskDto task);
    TaskDto getTask(String id);
    List<TaskDto> getTasks();
    void deleteTask(String id);
}
