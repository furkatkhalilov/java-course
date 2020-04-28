package day28.tasks.task2;

public class Task2 {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 10;
        rectangle1.length = 5;
        String output = "Perimeter: " + rectangle1.getPerimeter();
        System.out.println(output);
    }
}
