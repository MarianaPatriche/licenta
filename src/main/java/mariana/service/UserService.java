package mariana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import mariana.entity.User;
import mariana.entity.UserRole;
import mariana.mapper.UserMapper;
import mariana.models.UserProfileModel;
import mariana.models.UserRegisterModel;
import mariana.repository.UserRepository;
import mariana.repository.UserRoleRepository;
import mariana.utils.Auth;
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
	private PasswordEncoder passwordEncoder;

	public void saveUser(UserRegisterModel userRegisterModel) {
		User user = new User();
		UserRole userRole = new UserRole();

		user.setUsername(userRegisterModel.getUsername());
		user.setEnabled(true);
		user.setPassword(passwordEncoder.encode(userRegisterModel.getPassword()));
		user = userRepository.save(user);

		userRole.setRole(Role.ROLE_ADMIN.name());
		userRole.setUser(user);
		userRoleRepository.save(userRole);
	}

	public UserProfileModel getUserProfile() {
		return UserMapper.toUserModel(userRepository.findByUsername(Auth.userLoggedIn()).get(0));
	}

	public void saveUserProfile(UserProfileModel userProfileModel) {
		User user = userRepository.findOne(userProfileModel.getId());
		user = UserMapper.toUser(userProfileModel, user);

		userRepository.save(user);
	}

}
