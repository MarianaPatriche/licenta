package mariana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mariana.repository.UserRepository;
import mariana.service.UserService;

/**
 * Created by mariana on 04.04.2016.
 */

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/list")
	public String userList(@RequestParam(value = "page", required = true, defaultValue = "0") int page,
						   @RequestParam(value = "size", required = true, defaultValue = "3") int size,Model model){

		model.addAttribute("page", userRepository.findAll(new PageRequest(page, size)));

		return "user/list";
	}

}
