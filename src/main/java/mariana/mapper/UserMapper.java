package mariana.mapper;

import mariana.entity.User;
import mariana.models.UserProfileModel;

/**
 * Created by mariana on 17.03.2016.
 */
public class UserMapper {

	public static User toUser(UserProfileModel userProfileModel, User user){
		user.setId(userProfileModel.getId());
		user.setDescription(userProfileModel.getDescription());
		user.setBirthday(userProfileModel.getBirthday());
		user.setCity(userProfileModel.getCity());
		user.setFirstName(userProfileModel.getFirstName());
		user.setLastName(userProfileModel.getLastName());
		user.setEducation(userProfileModel.getEducation());
		user.setExperience(userProfileModel.getExperience());
		user.setTechnologies(userProfileModel.getTechnologies());
		user.setPhoneNumber(userProfileModel.getPhoneNumber());
		user.setEmail(userProfileModel.getEmail());

		return user;
	}

	public static UserProfileModel toUserModel(User user){
		UserProfileModel userProfileModel = new UserProfileModel();

		userProfileModel.setId(user.getId());
		userProfileModel.setDescription(user.getDescription());
		userProfileModel.setBirthday(user.getBirthday());
		userProfileModel.setCity(user.getCity());
		userProfileModel.setFirstName(user.getFirstName());
		userProfileModel.setLastName(user.getLastName());
		userProfileModel.setEducation(user.getEducation());
		userProfileModel.setExperience(user.getExperience());
		userProfileModel.setTechnologies(user.getTechnologies());
		userProfileModel.setPhoneNumber(user.getPhoneNumber());
		userProfileModel.setEmail(user.getEmail());
		userProfileModel.setEnabled(user.isEnabled());
		userProfileModel.setUsername(user.getUsername());
		userProfileModel.setGrade(user.getGrade());

		return userProfileModel;
	}
}
