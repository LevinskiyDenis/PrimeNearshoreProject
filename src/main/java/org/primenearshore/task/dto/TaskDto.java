package org.primenearshore.task.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class TaskDto {

    @JsonIgnore
    private Long id;

    private String description;

    private Long priority;

}
