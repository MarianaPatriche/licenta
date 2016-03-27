package mariana.service;

import mariana.entity.Project;
import mariana.mapper.ProjectMapper;
import mariana.models.ProjectModel;
import mariana.repository.ProjectRepository;
import mariana.utils.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mariana on 27.03.2016.
 */

@Service
@Transactional
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public void saveProject(ProjectModel projectModel){
        Project project = ProjectMapper.toProject(projectModel);

        project.setInitiator(Auth.userLoggedIn());

        projectRepository.save(project);
    }
}
