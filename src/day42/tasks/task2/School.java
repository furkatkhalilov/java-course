package day42.tasks.task2;

import java.util.List;

/*
Create class School with 5 attributes
and with extra one attribute as List<Student> students(which means you need to create class Student)
 */
public class School {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private String principal;

    private List<Student> students;

    public School(String name, String phoneNumber, String email, String address, String principal, List<Student> students) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.principal = principal;
        this.students = students;
    }


    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", principal='" + principal + '\'' +
                ", students=" + students +
                '}';
    }
}
