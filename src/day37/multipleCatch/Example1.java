package day37.multipleCatch;

public class Example1 {

    public static void main(String[] args) {
        String str = "text";
        try {
            char firstLetter = str.charAt(0);
            int a = 5 / 0;
        } catch(NullPointerException e1) {
            System.out.println("str is null");
        } catch(StringIndexOutOfBoundsException e2) {
            System.out.println("str is empty, no characters in it");
        } catch(RuntimeException e3) {
            System.out.println("other unpredicted situation");
        }
    }
}
