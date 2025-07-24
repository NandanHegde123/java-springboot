package com.coordinate.JobApp.repository;

import com.coordinate.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepository {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "dev", "efwef", 1, Arrays.asList("Java")),
            new JobPost(2, "web", "efwef", 1, Arrays.asList("Javascript")),
            new JobPost(1, "machine learning", "efwef", 1, Arrays.asList("Python"))
    ));


    public List<JobPost> getAllJobs(){
        return  jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
    }
}
