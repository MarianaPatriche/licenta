package mariana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import mariana.entity.UserRole;

/**
 * Created by mariana on 17.03.2016.
 */
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

	List<UserRole> findByUserId(Long userId);

	void deleteByUserId(Long userId);
}
