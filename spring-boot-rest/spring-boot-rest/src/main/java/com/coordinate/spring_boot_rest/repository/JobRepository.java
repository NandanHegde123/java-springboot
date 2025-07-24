package com.coordinate.spring_boot_rest.repository;

import com.coordinate.spring_boot_rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {

    @Query(value =  """
    SELECT * FROM job_post
    WHERE LOWER(post_profile) LIKE LOWER(CONCAT('%', ?1, '%'))
       OR CAST(post_id AS TEXT) LIKE CONCAT('%', ?1, '%')
       OR LOWER(post_description) LIKE LOWER(CONCAT('%', ?1, '%'))
       OR CAST(post_required_experience AS TEXT) LIKE CONCAT('%', ?1, '%')
    """, nativeQuery = true)
    //works for everything other than tech stack
List<JobPost> findByKeyword(String keyword);
//    List<JobPost> findByPostProfileContainingOrPostDescriptionContaining(String keyword);
}


//Before Jpa
//public class JobRepository {
////    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
////            new JobPost(1, "dev", "efwef", 1, Arrays.asList("Java")),
////            new JobPost(2, "web", "efwef", 1, Arrays.asList("Javascript")),
////            new JobPost(3, "machine learning", "efwef", 1, Arrays.asList("Python"))
////    ));
//
//
//    public List<JobPost> getAllJobs(){
//        return  jobs;
//    }
//
//    public void addJob(JobPost job){
//        jobs.add(job);
//    }
//
//    public JobPost getJob(int id){
//        for(JobPost jobPost: jobs){
//            if(id == jobPost.getPostId()){
//                return jobPost;
//            }
//        }
//        return null;
//    }
//
//    public void updateJob(JobPost jobPost) {
//        for(JobPost jobPost1: jobs){
//            if(jobPost1.getPostId()==jobPost.getPostId()){
//                jobPost1.setPostProfile(jobPost.getPostProfile());
//                jobPost1.setPostDescription(jobPost.getPostDescription());
//                jobPost1.setPostRequiredExperience(jobPost.getPostRequiredExperience());
//                jobPost1.setPostTechStack(jobPost.getPostTechStack());
//
//            }
//        }
//    }
//
//    public JobPost deleteJob(int postId) {
//        int removalIndex=0;
//        for(JobPost jobPost:jobs){
//            if(jobPost.getPostId() == postId){
//                return jobs.remove(removalIndex);
//            }
//            removalIndex++;
//        }
//        return null;
//    }
//}
