package day43.extendsKeyword.ex1;

public class Ex1 {

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.name = "I'm super";
        System.out.println(superClass);

        SubClass subClass = new SubClass();
        subClass.name ="I'm subclass";
        System.out.println(subClass);

    }
}
