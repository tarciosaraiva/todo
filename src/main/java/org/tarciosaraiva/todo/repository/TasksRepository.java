package org.tarciosaraiva.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.tarciosaraiva.todo.domain.Task;

import java.util.List;

public interface TasksRepository extends JpaRepository<Task, Long> {

	List<Task> findByActionContaining(@Param("action") String action);

}
