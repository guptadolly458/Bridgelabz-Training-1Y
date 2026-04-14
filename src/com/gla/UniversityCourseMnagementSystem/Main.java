package com.gla.UniversityCourseManagementSystem;

import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<ExamCourse> exams = Arrays.asList(new ExamCourse(), new ExamCourse());
        Utility.displayCourses(exams);
    }
}
