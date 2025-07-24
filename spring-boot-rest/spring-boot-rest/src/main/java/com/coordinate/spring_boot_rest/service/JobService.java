package com.coordinate.spring_boot_rest.service;

import com.coordinate.spring_boot_rest.model.JobPost;
import com.coordinate.spring_boot_rest.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {




    @Autowired
    private JobRepository repository;

    public void addJob(JobPost job){
//        repository.addJob(job);
        repository.save(job);
    }

    public List<JobPost> getAllJobs(){
//        return repository.getAllJobs();
        return repository.findAll();
    }


    public JobPost getJob(int id){
//        return repository.getJob(id);
        return repository.findById(id).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
//         repository.updateJob(jobPost);
         repository.save(jobPost);
    }

    public void deleteJob(int postId) {
//        return repository.deleteJob(postId);
        repository.deleteById(postId);
    }


    public void load() {
        List<JobPost> jobs =  new ArrayList<>(List.of(
                        new JobPost(1, "Software Engineer", "Exciting opportunity for a skilled software engineer.", 3, List.of("Java", "Spring", "SQL")),
                        new JobPost(2, "Data Scientist", "Join our data science team and work on cutting-edge projects.", 5, List.of("Python", "Machine Learning", "TensorFlow")),
                        new JobPost(3, "Frontend Developer", "Create amazing user interfaces with our talented frontend team.", 2, List.of("JavaScript", "React", "CSS")),
                        new JobPost(4, "Network Engineer", "Design and maintain our robust network infrastructure.", 4, List.of("Cisco", "Routing", "Firewalls")),
                        new JobPost(5, "UX Designer", "Shape the user experience with your creative design skills.", 3, List.of("UI/UX Design", "Adobe XD", "Prototyping"))

                ));

        repository.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
//        return repository.findByPostProfileContainingOrPostDescriptionContaining(keyword);
        return repository.findByKeyword(keyword);
    }

}
