package com.unimelb.swen30006.workshops;

/** A simple interface to allow for generic submission validators with different
 * validation rules for assignment submissions.
 * Created by Mat on 08/02/2016.
 */
public interface SubmissionValidator {

    /**
     * Validate a given submission, looping through all included files and returning
     * a response of all validation errors, or null if there are no errors
     * @param submission the assignment submission to validate
     * @return an array of validation errors (or possibly null if no errors)
     */

    /**
     *     private boolean isValidSubmission(Submission submission) {
     *         // e.g., check submission date <= dueDate and check attempt count <= maxAttempts
     *         if ((submission.date.compare(this.dueDate) <= 0 ) && (submission.attemptNum <= this.maxAttempts)){
     *
     *         }
     *         //       check file type is allowed, etc
     *
     *     }
     */
    ValidationError[] validateSubmission(Submission submission);

}
