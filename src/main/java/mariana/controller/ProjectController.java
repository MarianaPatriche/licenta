package mariana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

import mariana.models.ProjectModel;
import mariana.service.ProjectService;
import mariana.validator.ProjectValidator;

/**
 * Created by mariana on 27.03.2016.
 */

@Controller
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@Autowired
	private ProjectValidator projectValidator;

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String projectForm(Model model) {
		model.addAttribute("project", new ProjectModel());
		return "form";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String projectInsert(@Valid @ModelAttribute("project") ProjectModel projectModel, BindingResult bindingResult, Model model) {
		projectValidator.validate(projectModel, bindingResult);
		if (bindingResult.hasErrors()) {
			model.addAttribute("project", projectModel);
			return "form";
		}
		projectService.saveProject(projectModel);
		return "redirect:/";
	}
}
