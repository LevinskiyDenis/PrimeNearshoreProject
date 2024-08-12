package org.primenearshore.task.exception;

import org.primenearshore.exception.CommonParametrizedException;
import org.springframework.http.HttpStatus;

/**
 * The class stores constants with exceptions that may be thrown, when we work with Task.
 * The objective of this class is to make these exceptions reusable.
 */

public class TaskExceptions {

    public static final CommonParametrizedException TASK_NOT_FOUND_WITH_GIVEN_ID = CommonParametrizedException.builder()
            .httpStatus(HttpStatus.NOT_FOUND)
            .message("Cannot find task with given id")
            .build();

    public static final CommonParametrizedException TASK_DESCRIPTION_IS_REQUIRED = CommonParametrizedException.builder()
            .httpStatus(HttpStatus.BAD_REQUEST)
            .message("Task description is required")
            .build();

}
