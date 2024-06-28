package school;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Course> courses;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displaySchoolInfo() {
        System.out.println("School Name: " + name);
        System.out.println("Number of Students: " + students.size());
        System.out.println("Number of Teachers: " + teachers.size());
        System.out.println("Number of Courses: " + courses.size());
    }

    public static void main(String[] args) {
        School school = new School("Green Valley High");

        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        Teacher teacher1 = new Teacher("Mr. Smith", "Mathematics");
        Teacher teacher2 = new Teacher("Ms. Johnson", "English");

        Course course1 = new Course("Mathematics", teacher1);
        Course course2 = new Course("English", teacher2);

        school.addStudent(student1);
        school.addStudent(student2);

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);

        school.addCourse(course1);
        school.addCourse(course2);

        school.displaySchoolInfo();
    }
}

