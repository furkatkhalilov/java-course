package day43.extendsKeyword.ex2;

public class Apple extends Fruit {

    //constructor are not inherited
    public Apple(String name){
        super(name);
        super.name = "Red Apple";
    }
}
