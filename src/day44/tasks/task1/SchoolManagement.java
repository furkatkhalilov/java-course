package day44.tasks.task1;

import java.util.List;

public class SchoolManagement {

    public static void main(String[] args) {
        School school = new School();

        school.registerStudent(new Student());
        List<Student> students = school.registerStudent(new Student());



        school.registerEmployee(new Employee());
        List<Employee> employees = school.registerEmployee(new Employee());


        students.add(new Student());
        students.add(new Student());
        students.add(new Student());

        employees.add(new Employee());
        employees.add(new Employee());
        employees.add(new Employee());

    }
}
