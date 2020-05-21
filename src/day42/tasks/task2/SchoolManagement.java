package day42.tasks.task2;

import java.util.ArrayList;
import java.util.List;

//create 2 schools and at least 3 students in each school
public class SchoolManagement {

    public static void main(String[] args) {
        School school1 = new School("TechnoStudy",
                "+1-551-301-33-34",
                "info@techno.study",
                "Getty 600",
                "Fetih",
                getStudents());

        School school2 = new School("BIL",
                "+1-555-333-22-11",
                "info@bil.com",
                "Main 600",
                "Dos",
                getStudents());

        System.out.println(school1);
        System.out.println(school2);

    }

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Furkat", "Ali"));
        students.add(new Student("Serdar", "Durbayev"));
        students.add(new Student("Aysegul", "Ayhan"));
        return students;
    }


}
