class Course {
    String courseName;
    int duration;
    double fee;

    static String instituteName = "ABC Institute";

    Course(String name, int duration, double fee) {
        this.courseName = name;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " | " + duration + " | " + fee + " | " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }
}
