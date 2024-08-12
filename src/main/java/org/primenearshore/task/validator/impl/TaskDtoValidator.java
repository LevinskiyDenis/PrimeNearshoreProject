package org.primenearshore.task.validator.impl;

import org.apache.commons.lang3.StringUtils;
import org.primenearshore.task.dto.TaskDto;
import org.primenearshore.task.exception.TaskExceptions;
import org.primenearshore.task.validator.AbstractTaskDtoValidator;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoValidator extends AbstractTaskDtoValidator<TaskDto> {

    @Override
    public void validateTask(TaskDto taskDto) {
        validateDescription(taskDto);

        // if would like to validate all fields and then throw an exception with details,
        // we could have done something like this:
        // validateField1(TaskDto taskDto, List<Map.Entry<String, String>> exceptionDetails)
        // validateField2(TaskDto taskDto, List<Map.Entry<String, String>> exceptionDetails)
        // throwExceptionIfFailedChecks(List<Map.Entry<String, String>> exceptionDetails)
    }

    private void validateDescription(TaskDto taskDto) {
        if (StringUtils.isBlank(taskDto.getDescription())) {
            throw TaskExceptions.TASK_DESCRIPTION_IS_REQUIRED;
        }

    }


}
