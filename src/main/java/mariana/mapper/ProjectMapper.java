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
        project.setProgrammingLanguage(projectModel.getProgrammingLanguage());
        project.setInitiator(projectModel.getInitiator());

        return project;
    }

    public static ProjectModel toProjectModel(Project project){
        ProjectModel projectModel = new ProjectModel();

        projectModel.setId(project.getId());
        projectModel.setInitiator(project.getInitiator());
        projectModel.setProgrammingLanguage(project.getProgrammingLanguage());
        projectModel.setNoOfPeople(project.getNoOfPeople());
        projectModel.setName(project.getName());
        projectModel.setDaysToFinalize(project.getDaysToFinalize());
        projectModel.setDescription(project.getDescription());

        return projectModel;
    }
}
