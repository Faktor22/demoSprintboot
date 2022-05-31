package restcontroller;

import domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import services.ProjectService;

import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @CrossOrigin
    @GetMapping("/projects")
    public List<Project> getProjects(){
        return projectService.findAllProjects();
    }
}
