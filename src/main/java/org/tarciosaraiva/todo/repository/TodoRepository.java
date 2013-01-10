package org.tarciosaraiva.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tarciosaraiva.todo.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
