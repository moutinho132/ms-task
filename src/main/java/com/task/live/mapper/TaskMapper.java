package com.task.live.mapper;

import com.task.live.dto.TaskDto;
import com.task.live.entity.Task;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDto toDto(Task task);
    Task toTask(TaskDto taskDto);
}
