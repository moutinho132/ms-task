package com.task.live.service;

import com.task.live.dto.TaskDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TaskServiceImpl implements TaskService {
    @Override
    public TaskDto addTask(TaskDto task) {
        return null;
    }

    @Override
    public TaskDto updateTask(TaskDto task) {
        return null;
    }

    @Override
    public TaskDto getTask(String id) {
        return null;
    }

    @Override
    public List<TaskDto> getTasks() {
        return List.of();
    }

    @Override
    public void deleteTask(String id) {

    }
}
