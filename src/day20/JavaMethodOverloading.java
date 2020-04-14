package day20;

public class JavaMethodOverloading {
    /*
    Different ways of doing overloading methods:
    1. The number of parameters in two methods.
    2. The data types of the parameters of methods.
    3. The Order of the parameters of methods.
     */

    public static void main(String[] args) {
        int sum = sum(1, 2);
        int sumOf5 = sum(5, 5, 5);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    //1. The number of parameters in two methods.
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //2. The data types of the parameters of methods.
    public static double sum(double a, double b) {
        return a + b;
    }


    //    3. The order of the parameters of methods.
    public static void printUser(String name, int age) {
        //you code
    }

    public static void printUser(int age, String name) {
        //you code
    }
}
