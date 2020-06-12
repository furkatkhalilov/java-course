package day53.flashcards.classDesign;

import java.lang.String;

public class Q6 {

    {
        System.out.println("instance initializer");
    }
    public Q6(){
        System.out.println("constructor");
    }


    public static void main(String[] args) {
        Q6 q6 = new Q6();

        String s = "";
        switch(s){
            default:break;
            //default:break;
        }
    }



}











class Spider {

    public void printName(short input) {
        System.out.print("A");
    }


    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.printName((short) 4);
    }
}
