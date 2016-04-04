package mariana.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.List;

import mariana.entity.User;
import mariana.models.UserProfileModel;
import mariana.models.UserRegisterModel;
import mariana.repository.UserRepository;

/**
 * Created by mariana on 18.03.2016.
 */

@Component
public class UsernameValidator implements Validator {

	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean supports(Class<?> x){
		return UserProfileModel.class.isAssignableFrom(x);
	}

	@Override
	public void validate(Object o, Errors errors){
		UserRegisterModel userRegisterModel = (UserRegisterModel) o;
		List<User> userList = userRepository.findByUsername(userRegisterModel.getUsername());

		for(User user : userList){
			if(user.getUsername().equals(userRegisterModel.getUsername())){
				errors.rejectValue("username", "username.already.exist");
			}
		}
	}

}
