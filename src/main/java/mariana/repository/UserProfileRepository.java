package mariana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mariana.entity.UserProfile;

/**
 * Created by mariana on 29.03.2016.
 */
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
	UserProfile findByUserUsername(String username);
}
