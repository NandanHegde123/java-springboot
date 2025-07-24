package com.coordinate.JobApp;

import com.coordinate.JobApp.model.JobPost;
import com.coordinate.JobApp.service.JobService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping({"/", "home"})
    public String home(){
        System.out.println("home method called");
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){
        System.out.println("addJob method called");
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){

        service.addJob(jobPost);
        System.out.println(jobPost);

        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewAllJobs(Model model){
        System.out.println("viewAllJobs method called");
        List<JobPost> jobs=service.getAllJobs();
        model.addAttribute("jobPosts", jobs);
        return  "viewalljobs";
    }
}
