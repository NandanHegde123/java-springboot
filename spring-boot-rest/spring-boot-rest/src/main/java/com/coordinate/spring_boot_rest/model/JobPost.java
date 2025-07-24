package com.coordinate.spring_boot_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.util.List;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Component
@Entity

public class JobPost {

    @Id
    private int postId;

    private String postProfile;
    private String postDescription;
    private int postRequiredExperience;
    private List<String> postTechStack;

    public JobPost(){
        this.postId=0;
        this.postProfile="";
        this.postDescription="";
        this.postRequiredExperience=0;
        this.postTechStack=null;
    }

    public JobPost(int postId, String postProfile, String postDescription, int postRequiredExperience, List<String> postTechStack){
        this.postId=postId;
        this.postProfile=postProfile;
        this.postDescription=postDescription;
        this.postRequiredExperience=postRequiredExperience;
        this.postTechStack=postTechStack;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostProfile() {
        return postProfile;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public int getPostRequiredExperience() {
        return postRequiredExperience;
    }

    public void setPostRequiredExperience(int postRequiredExperience) {
        this.postRequiredExperience = postRequiredExperience;
    }

    public List<String> getPostTechStack() {
        return postTechStack;
    }

    public void setPostTechStack(List<String> postTechStack) {
        this.postTechStack = postTechStack;
    }

    @Override
    public String toString() {
        return "JobPost{" +
                "postId=" + postId +
                ", postProfile='" + postProfile + '\'' +
                ", postDescription='" + postDescription + '\'' +
                ", postRequiredExperience=" + postRequiredExperience +
                ", postTechStack=" + postTechStack +
                '}';
    }

}
