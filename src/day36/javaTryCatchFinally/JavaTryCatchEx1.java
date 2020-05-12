package day36.javaTryCatchFinally;

public class JavaTryCatchEx1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch(Exception exception) {
            System.out.println("something gone wrong, please look to variables");
            System.out.println(exception);
            exception.printStackTrace();

            System.err.println("Error is here");
        }

        System.out.println("End of code");

    }
}
