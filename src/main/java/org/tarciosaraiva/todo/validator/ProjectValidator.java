package org.tarciosaraiva.todo.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.tarciosaraiva.todo.domain.Project;

import java.util.Date;

public class ProjectValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Project.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "not.blank", "Project name is mandatory.");

		Project project = (Project) target;

		if (null == project.getDue()) {
			errors.rejectValue("due", "not.null", "Project due date is mandatory.");
			return;
		}

		final Date today = new Date();
		if (today.after(project.getDue())) {
			errors.rejectValue("due", "not.past", "Due date should be in the future.");
		}
	}
}
