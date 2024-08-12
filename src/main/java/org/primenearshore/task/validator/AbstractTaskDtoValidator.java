package org.primenearshore.task.validator;

import org.primenearshore.exception.CommonParametrizedException;
import org.primenearshore.task.dto.TaskDto;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Map;

/**
 * The class provides a standard mechanism for creating validators
 * that can be used for various types of tasks (now we have only TaskDto, but I suppose that
 * eventually we will have different subtypes of tasks in a to-do list app).
 * This simplifies the expansion of the system and allows to create some common logic for all types of task validators.
 */

public abstract class AbstractTaskDtoValidator<T extends TaskDto> {

    protected abstract void validateTask(T taskDto);

    protected void throwExceptionIfFailedChecks(List<Map.Entry<String, String>> exceptionDetails) {
        if (!exceptionDetails.isEmpty()) {
            CommonParametrizedException.builder()
                    .httpStatus(HttpStatus.BAD_REQUEST)
                    .message("Bad parameters")
                    .parameters(exceptionDetails)
                    .build();
        }
    }


}
