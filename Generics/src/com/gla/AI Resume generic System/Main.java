package com.gla.AIResumeScreeningSystem;

import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<SoftwareEngineer> engineers = Arrays.asList(new SoftwareEngineer(), new SoftwareEngineer());
        Utility.processResumes(engineers);
    }
}
