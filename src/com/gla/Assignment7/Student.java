class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double cgpa) {
        CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    void display() {
        System.out.println(rollNumber + " " + name);
    }
}
