package mariana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mariana.entity.UserProfile;
import mariana.mapper.UserProfileMapper;
import mariana.models.UserProfileModel;
import mariana.repository.UserProfileRepository;
import mariana.utils.Auth;

/**
 * Created by mariana on 29.03.2016.
 */

@Service
@Transactional
public class UserProfileService {

	@Autowired
	private UserProfileRepository userProfileRepository;


	public UserProfileModel getUserProfileModel() {

		return UserProfileMapper.toUserProfileModel(userProfileRepository.findByUserUsername(Auth.userLoggedIn()));
	}

	public void saveUserProfile(UserProfileModel userProfileModel){
		UserProfile userProfile = userProfileRepository.findOne(userProfileModel.getId());

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

		userProfileRepository.save(userProfile);
	}


}
