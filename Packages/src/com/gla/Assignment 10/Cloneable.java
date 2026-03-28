class Student implements Cloneable {
    int id;

    Student(int id) {
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}