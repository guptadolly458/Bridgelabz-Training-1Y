package com.gla.UniversityCourseManagementSystem;

class Course<T extends CourseType> {
    T type;

    Course(T type) {
        this.type = type;
    }
}
