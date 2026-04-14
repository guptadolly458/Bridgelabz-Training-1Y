package com.gla.UniversityCourseManagementSystem;

import java.util.List;

class Utility {
    public static void displayCourses(List<? extends CourseType> list) {
        System.out.println("Courses available: " + list.size());
    }
}
