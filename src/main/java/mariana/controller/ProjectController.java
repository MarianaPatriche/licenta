package mariana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

import mariana.models.ProjectModel;
import mariana.repository.ProjectRepository;
import mariana.service.ProjectService;
import mariana.validator.ProjectValidator;

/**
 * Created by mariana on 27.03.2016.
 */

@Controller
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@Autowired
	private ProjectRepository projectRepository;

	@Autowired
	private ProjectValidator projectValidator;

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String projectForm(Model model) {
		model.addAttribute("project", new ProjectModel());
		return "project/form";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String projectInsert(@Valid @ModelAttribute("project") ProjectModel projectModel, BindingResult bindingResult, Model model) {
		projectValidator.validate(projectModel, bindingResult);
		if (bindingResult.hasErrors()) {
			model.addAttribute("project", projectModel);
			return "project/form";
		}
		projectService.saveProject(projectModel);
		return "redirect:/";
	}

	@RequestMapping(value = "/list")
	public String projectList(Model model){
		model.addAttribute("projectList", projectRepository.findAll());
		return "project/list";
	}

	@RequestMapping(value = "/detail/{id}")
	public String projectDetail(@PathVariable("id") Long id , Model model){
		model.addAttribute("project", projectService.getProjectModel(id));

		return "project/detail";
	}
}
