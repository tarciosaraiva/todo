package org.tarciosaraiva.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.tarciosaraiva.todo.domain.Project;

import java.util.Date;
import java.util.List;

public interface ProjectsRepository extends JpaRepository<Project, Long> {

	List<Project> findByNameContaining(@Param("name") String name);

	@Query(name = "", value = "")
	List<Project> findByDue(@Param("due") Date date);

}
