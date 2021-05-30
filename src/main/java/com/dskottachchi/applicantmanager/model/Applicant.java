package com.dskottachchi.applicantmanager.model;

import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.*;
import java.io.Serializable;

// The Applicant Model
@Entity
public class Applicant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)  // ID Cannot be NULL or Updated
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phoneNumber;
    private String imageUrl;
    @Column(nullable = false, updatable = false) // Applicant ID cannot be null or updated
    private String applicantCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getApplicantCode() {
        return applicantCode;
    }

    public void setApplicantCode(String applicantCode) {
        this.applicantCode = applicantCode;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", applicantCode='" + applicantCode + '\'' +
                '}';
    }
}
