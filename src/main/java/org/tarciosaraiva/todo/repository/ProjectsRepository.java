package org.tarciosaraiva.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tarciosaraiva.todo.domain.Project;

public interface ProjectsRepository extends JpaRepository<Project, Long> {

//	List<Project> findByNameContaining(@Param("name") String name);

}
