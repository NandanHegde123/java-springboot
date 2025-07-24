package com.coordinate.spring_boot_rest;

import com.coordinate.spring_boot_rest.model.JobPost;
import com.coordinate.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

//    public String getAllJobs(Model m){
//        List<JobPost> jobs=service.getAllJobs();
//        m.addAttribute("jobPosts", jobs);
//        return "viewalljobs";
//
//    }

    @GetMapping("jobPosts")
//    @ResponseBody// or can change @Controller to RestController then this is not required
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return service.getJob(postId);

    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword){
        return service.search(keyword);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public void deleteJob(@PathVariable int postId){
//        return service.deleteJob(postId);
        service.deleteJob(postId);
    }

    @GetMapping("load")
    public boolean loadData(){
        service.load();
        return true;
    }

}
