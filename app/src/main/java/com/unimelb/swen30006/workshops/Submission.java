package com.unimelb.swen30006.workshops;
import java.util.Date;

class Submission {
    // Return two fake files
    public int attemptNum;
    public int numFiles;
    public Date date;
    public File[] includedFiles(){
        File[] files = new File[2];
        files[0] = new File();
        files[1] = new File();
        return files;
    }
}
