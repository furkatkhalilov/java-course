package day44.tasks.task1;

public class SchoolManagement {

    public static void main(String[] args) {
        School school = new School("Art Lyceum", 50);
        school.registerStudent(new Student("Samil", "OH 134", school, 5000));
        school.registerStudent(new Student("Yusuf", "Hazel 596", school, 4000));

        school.registerEmployee(new Employee("Fetih", "High st 59", school, 90_000));
        school.registerEmployee(new Employee("Katya", "Mountain st 59", school, 100_000));


        System.out.println(school);
    }
}
