package mariana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import mariana.models.UserProfileModel;
import mariana.service.UserProfileService;

/**
 * Created by mariana on 29.03.2016.
 */

@Controller
@RequestMapping("/profile")
public class ProfileController {

	@Autowired
	private UserProfileService userProfileService;

	@RequestMapping("/form")
	public String getProfileForm(Model model) {
		model.addAttribute("profile", userProfileService.getUserProfileModel());

		return "profile/form";
	}

	@RequestMapping("/save")
	public String saveProfileForm(@Valid @ModelAttribute("profile")UserProfileModel userProfileModel, BindingResult bindingResult, Model model){
		if(bindingResult.hasErrors()){
			model.addAttribute("profile", userProfileModel);
			return "profile/form";
		}

		userProfileService.saveUserProfile(userProfileModel);

		return "redirect:/";

	}

}
