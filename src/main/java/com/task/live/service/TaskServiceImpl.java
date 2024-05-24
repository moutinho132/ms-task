package com.task.live.service;

import com.task.live.dto.TaskDto;
import com.task.live.entity.Task;
import com.task.live.mapper.TaskMapper;
import com.task.live.repository.TaskRepository;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Log4j2
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository repository;
    @Autowired
    private TaskMapper mapper;

    @Override
    public TaskDto addTask(TaskDto task) {
        log.info(" add task request : {}",task);
        TaskDto taskDto = null;
        if (Objects.nonNull(task)) {
            taskDto = getTaskDto(task, taskDto);
        }
        return taskDto;
    }

    private TaskDto getTaskDto(TaskDto task, TaskDto taskDto) {
        Task saved = repository.save(mapper.toTask(task));
        if (Objects.nonNull(saved)) {
            log.info(" add task success  : {}",saved);
            taskDto = mapper.toDto(saved);
        }
        return taskDto;
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
