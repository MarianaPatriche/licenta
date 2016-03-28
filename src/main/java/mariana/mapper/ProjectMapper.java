package mariana.mapper;

import mariana.entity.Project;
import mariana.models.ProjectModel;

/**
 * Created by mariana on 27.03.2016.
 */
public class ProjectMapper {

    public static Project toProject(ProjectModel projectModel){
        Project project = new Project();

        project.setId(projectModel.getId());
        project.setDaysToFinalize(projectModel.getDaysToFinalize());
        project.setDescription(projectModel.getDescription());
        project.setName(projectModel.getName());
        project.setNoOfPeople(projectModel.getNoOfPeople());
        project.setTechnologies(projectModel.getTechnologies());
        project.setSpecifications(projectModel.getSpecifications());
        project.setLanguages(projectModel.getLanguages());

        return project;
    }

    public static ProjectModel toProjectModel(Project project){
        ProjectModel projectModel = new ProjectModel();

        projectModel.setId(project.getId());
        projectModel.setCreatedBy(project.getCreatedBy());
        projectModel.setTechnologies(project.getTechnologies());
        projectModel.setNoOfPeople(project.getNoOfPeople());
        projectModel.setName(project.getName());
        projectModel.setDaysToFinalize(project.getDaysToFinalize());
        projectModel.setDescription(project.getDescription());
        projectModel.setLanguages(project.getLanguages());
        projectModel.setSpecifications(project.getSpecifications());
        projectModel.setCreatedDate(project.getCreatedDate());

        return projectModel;
    }
}
