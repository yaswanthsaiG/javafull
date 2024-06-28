package school;

public class SchoolTest {
        public static void main(String[] ignoredArgs) {
            // Create a school
            School school = new School("Green Valley High");

            // Create students
            Student student1 = new Student("Alice", 101);
            Student student2 = new Student("Bob", 102);

            // Create teachers
            Teacher teacher1 = new Teacher("Mr. Smith", "Mathematics");
            Teacher teacher2 = new Teacher("Ms. Johnson", "English");

            // Create courses
            Course course1 = new Course("Mathematics", teacher1);
            Course course2 = new Course("English", teacher2);

            // Add students, teachers, and courses to the school
            school.addStudent(student1);
            school.addStudent(student2);

            school.addTeacher(teacher1);
            school.addTeacher(teacher2);

            school.addCourse(course1);
            school.addCourse(course2);

            // Display school information
            school.displaySchoolInfo();
        }
    }

