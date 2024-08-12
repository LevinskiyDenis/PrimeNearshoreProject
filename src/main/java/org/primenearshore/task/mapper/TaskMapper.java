package org.primenearshore.task.mapper;

import org.mapstruct.Mapper;
import org.primenearshore.task.dto.TaskDto;
import org.primenearshore.task.entity.Task;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toTaskDto(Task task);

    Task toTaskEntity(TaskDto taskDto);

}
