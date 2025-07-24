package com.coordinate.JobApp.service;

import com.coordinate.JobApp.model.JobPost;
import com.coordinate.JobApp.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository repository;

    public void addJob(JobPost job){
        repository.addJob(job);
    }

    public List<JobPost> getAllJobs(){
        return repository.getAllJobs();
    }
}
