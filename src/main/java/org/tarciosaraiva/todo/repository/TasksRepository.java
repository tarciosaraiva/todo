package org.tarciosaraiva.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tarciosaraiva.todo.domain.Task;

public interface TasksRepository extends JpaRepository<Task, Long> {

//	List<Task> findByDescriptionContaining(@Param("description") String description);

}
