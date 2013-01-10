package org.tarciosaraiva.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tarciosaraiva.todo.domain.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
