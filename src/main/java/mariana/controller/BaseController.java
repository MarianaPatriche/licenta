package mariana.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import mariana.utils.Auth;

/**
 * Created by mariana on 17.03.2016.
 */
public class BaseController {

	@ModelAttribute("userLoggedIn")
	public String getUserLoggedIn(){
		return Auth.userLoggedIn();
	}
}
