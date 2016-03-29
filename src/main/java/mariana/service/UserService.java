package mariana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import mariana.entity.User;
import mariana.entity.UserProfile;
import mariana.entity.UserRole;
import mariana.models.UserModel;
import mariana.repository.UserProfileRepository;
import mariana.repository.UserRepository;
import mariana.repository.UserRoleRepository;
import mariana.utils.Role;

/**
 * Created by mariana on 17.03.2016.
 */

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserRoleRepository userRoleRepository;

	@Autowired
	private UserProfileRepository userProfileRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public void saveUser(UserModel userModel) {
		User user = new User();
		UserRole userRole = new UserRole();
		UserProfile userProfile = new UserProfile();

		user.setUsername(userModel.getUsername());
		user.setEnabled(true);
		user.setPassword(passwordEncoder.encode(userModel.getPassword()));
		user = userRepository.save(user);

		userRole.setRole(Role.ROLE_ADMIN.name());
		userRole.setUser(user);
		userRoleRepository.save(userRole);

		userProfile.setUser(user);
		userProfileRepository.save(userProfile);
	}

}
