package mariana.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.List;

import mariana.entity.Project;
import mariana.models.ProjectModel;
import mariana.repository.ProjectRepository;

/**
 * Created by mariana on 28.03.2016.
 */

@Component
public class ProjectValidator implements Validator {

	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public boolean supports(Class<?> x) {
		return ProjectModel.class.isAssignableFrom(x);
	}

	@Override
	public void validate(Object o, Errors errors) {
		ProjectModel projectModel = (ProjectModel) o;
		List<Project> projectList = projectRepository.findByName(projectModel.getName());

		for (Project user : projectList) {
			if (user.getName().equals(projectModel.getName())) {
				errors.rejectValue("name", "project.name.already.exist");
			}
		}
	}

}
