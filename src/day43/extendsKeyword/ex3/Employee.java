package day43.extendsKeyword.ex3;

public class Employee {
    public String name;
    public double salary;
    public double coef; //epi

    public Employee(String name, double salary, double coef) {
        this.name = name;
        this.salary = salary;
        this.coef = coef;
    }

    public double calculateSalary(){
        return this.salary * this.coef;
    }
}
