package day19;

public class JavaMethods {

    public static void main(String[] args) {
        System.out.println( "Step 1" );
        printGoodMorning();

        System.out.println( "Next Step" );
        printGoodMorning();

        System.out.println( "Another call of method" );
        printGoodMorning();

        System.out.println( "Yet another" );
        printGoodMorning();
        printGoodMorning();

    }

    //void is return type which returns nothing
    public static void printGoodMorning() {
        // assume you have 100 lines of code here
        System.out.println( "Good Morning!!!" );
    }

}
