package mariana.repository;

import mariana.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mariana on 27.03.2016.
 */
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
