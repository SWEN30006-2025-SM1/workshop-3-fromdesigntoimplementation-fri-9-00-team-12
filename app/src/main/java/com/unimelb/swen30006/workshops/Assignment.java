package com.unimelb.swen30006.workshops;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Assignment {
    private String description;
    private Date dueDate;
    private int maxAttempts;
    private String name;

    // Keep track of submissions
    private List<Submission> validSubmissions = new ArrayList<>();
    private List<Submission> invalidSubmissions = new ArrayList<>();

    public Assignment(String description, Date dueDate, int maxAttempts, String name) {
        this.description = description;
        this.dueDate = dueDate;
        this.maxAttempts = maxAttempts;
        this.name = name;
    }
    public void addSubmission(Submission submission) {
        // Some logic to decide if it's valid or not
        if(isValidSubmission(submission)) {
            validSubmissions.add(submission);
        } else {
            invalidSubmissions.add(submission);
        }
    }


}
