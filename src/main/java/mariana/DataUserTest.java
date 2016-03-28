package mariana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

import mariana.entity.User;
import mariana.entity.UserRole;
import mariana.repository.UserRepository;
import mariana.repository.UserRoleRepository;
import mariana.utils.Role;

/**
 * Created by mariana on 17.03.2016.
 */

@Service
@Transactional
public class DataUserTest {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserRoleRepository userRoleRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	@PostConstruct
	public void initData() {

		/**
		 * Check for empty database.
		 */

		if (userRepository.count() > 0) {
			return;
		}

		/**
		 * ADMIN USER.
		 */
		User admin = new User("admin", passwordEncoder.encode("admin"), true);
		admin = userRepository.save(admin);
		UserRole userRoleAdmin = new UserRole(admin, Role.ROLE_ADMIN.name());
		userRoleRepository.save(userRoleAdmin);
	}
}
