package day53.flashcards.Assessment;

import org.junit.Test;

public class AssessmentDay53 {

    @Test
    public void q2(){
        String str = new String("Java");

        String s1 = "Java";
        String s2 = "Java";

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
//        System.out.println("s1:"+s1.hashCode());
//        System.out.println("s2:"+s2.hashCode());
//        System.out.println(s1 == s2); // true
//        System.out.println(s1.equals(s2)); //true


        System.out.println("sb1.toString():"+sb1.toString().hashCode());
        System.out.println("s1:"+s1.hashCode());
        System.out.println(sb1.toString() == s1); //false
//        System.out.println(sb1.toString().equals(s1)); //true
    }
}
