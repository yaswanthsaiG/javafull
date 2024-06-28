package school;


public class Course {
    private final String name;

    public Course(String name, Teacher ignoredTeacher) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

