package mariana.controller;

import mariana.models.ProjectModel;
import mariana.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mariana on 27.03.2016.
 */

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String projectForm(Model model){
        model.addAttribute("project", new ProjectModel());
        return "form";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String projectInsert(@ModelAttribute("project") ProjectModel projectModel){
        projectService.saveProject(projectModel);
        return "redirect:/";
    }
}
