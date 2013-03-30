package org.tarciosaraiva.todo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Task implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String action;

	@Column
	private boolean completed = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Task)) return false;

		Task task = (Task) o;

		if (completed != task.completed) return false;
		if (action != null ? !action.equals(task.action) : task.action != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = action != null ? action.hashCode() : 0;
		result = 31 * result + (completed ? 1 : 0);
		return result;
	}

}
