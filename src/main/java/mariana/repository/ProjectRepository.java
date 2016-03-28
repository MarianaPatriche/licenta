package mariana.repository;

import mariana.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by mariana on 27.03.2016.
 */
public interface ProjectRepository extends JpaRepository<Project, Long> {
	List<Project> findByName(String name);
}
