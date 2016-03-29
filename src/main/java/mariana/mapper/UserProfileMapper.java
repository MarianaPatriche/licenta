package mariana.mapper;

import mariana.entity.UserProfile;
import mariana.models.UserProfileModel;

/**
 * Created by mariana on 29.03.2016.
 */
public class UserProfileMapper {

	public static UserProfile toUserProfile(UserProfileModel userProfileModel){
		UserProfile userProfile = new UserProfile();

		userProfile.setId(userProfileModel.getId());
		userProfile.setFirstName(userProfileModel.getFirstName());
		userProfile.setLastName(userProfileModel.getLastName());
		userProfile.setDescription(userProfileModel.getDescription());
		userProfile.setBirthday(userProfileModel.getBirthday());
		userProfile.setEducation(userProfileModel.getEducation());
		userProfile.setExperience(userProfileModel.getExperience());
		userProfile.setTechnologies(userProfileModel.getTechnologies());
		userProfile.setCity(userProfileModel.getCity());
		userProfile.setPhoneNumber(userProfileModel.getPhoneNumber());
		userProfile.setEmail(userProfileModel.getEmail());

		return userProfile;
	}

	public static UserProfileModel toUserProfileModel(UserProfile userProfile){
		UserProfileModel userProfileModel = new UserProfileModel();

		userProfileModel.setId(userProfile.getId());
		userProfileModel.setFirstName(userProfile.getFirstName());
		userProfileModel.setLastName(userProfile.getLastName());
		userProfileModel.setDescription(userProfile.getDescription());
		userProfileModel.setBirthday(userProfile.getBirthday());
		userProfileModel.setEducation(userProfile.getEducation());
		userProfileModel.setExperience(userProfile.getExperience());
		userProfileModel.setTechnologies(userProfile.getTechnologies());
		userProfileModel.setCity(userProfile.getCity());
		userProfileModel.setPhoneNumber(userProfile.getPhoneNumber());
		userProfileModel.setEmail(userProfile.getEmail());

		return userProfileModel;
	}
}
