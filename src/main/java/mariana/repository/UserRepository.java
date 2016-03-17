package mariana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import mariana.entity.User;

/**
 * Created by mariana on 17.03.2016.
 */
public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByUsername(String username);

	@Query("select ur.user from UserRole ur where ur.role = ?1")
	List<User> findUserByRole(String role);
}
