package mariana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

import mariana.models.UserProfileModel;
import mariana.models.UserRegisterModel;
import mariana.service.UserService;
import mariana.validator.UsernameValidator;

/**
 * Created by mariana on 17.03.2016.
 */

@Controller
public class RegisterController extends BaseController {

	@Autowired
	UserService userService;

	@Autowired
	UsernameValidator usernameValidator;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerForm(Model model){
		model.addAttribute("user", new UserRegisterModel());
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user")UserRegisterModel user, BindingResult bindingResult, Model model){

		usernameValidator.validate(user, bindingResult);
		if(bindingResult.hasErrors()){
			model.addAttribute("user", user);
			return "/register";
		}

		userService.saveUser(user);

		return "redirect:/login";
	}
}
