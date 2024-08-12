package org.primenearshore.task.controller;

import lombok.RequiredArgsConstructor;
import org.primenearshore.task.dto.TaskDto;
import org.primenearshore.task.service.TaskService;
import org.primenearshore.task.validator.impl.TaskDtoValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;
    private final TaskDtoValidator taskDtoValidator;

    @PutMapping("/{id}")
    public ResponseEntity<TaskDto> updateTask(@PathVariable Long id, @RequestBody TaskDto taskDto) {
        taskDto.setId(id);
        // According to my experience, using own validator is more flexible and convenient for exception handling than @Valid
        taskDtoValidator.validateTask(taskDto);
        return new ResponseEntity<>(taskService.updateTask(taskDto), HttpStatus.OK);
    }

}
