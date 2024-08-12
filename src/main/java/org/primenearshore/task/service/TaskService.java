package org.primenearshore.task.service;

import lombok.RequiredArgsConstructor;
import org.primenearshore.task.dto.TaskDto;
import org.primenearshore.task.entity.Task;
import org.primenearshore.task.exception.TaskExceptions;
import org.primenearshore.task.mapper.TaskMapper;
import org.primenearshore.task.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public TaskDto updateTask(TaskDto taskDto) {
        Task task = taskRepository.updateTask(taskDto).orElseThrow(() -> TaskExceptions.TASK_NOT_FOUND_WITH_GIVEN_ID);
        return taskMapper.toTaskDto(task);
    }

}
