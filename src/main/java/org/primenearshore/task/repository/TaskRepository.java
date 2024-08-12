package org.primenearshore.task.repository;

import org.primenearshore.task.dto.TaskDto;
import org.primenearshore.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    /**
     * Updates the task in the database using a native SQL query to modify the description
     * and priority based on the given TaskDto. This method returns the updated Task
     * if the operation is successful.
     * <p>
     * Advantages:
     * + Leverages the RETURNING clause of PostgreSQL, which allows obtaining the updated
     * record in the same operation, reducing the need for additional queries
     * to retrieve the updated entity.
     * <p>
     * Disadvantages:
     * - This implementation uses a PostgreSQL-specific query.
     */

    @Query(value = "UPDATE task SET description = :#{#taskDto.description}, priority = :#{#taskDto.priority} WHERE id = :#{#taskDto.id} RETURNING *", nativeQuery = true)
    Optional<Task> updateTask(@Param("taskDto") TaskDto taskDto);

}