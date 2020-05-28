package day44.superVsThis;

/*
differentiate the members of superclass
from the members of subclass,
if they have same names.
 */
public class Apple extends Fruit {

    public String name;

    public Apple() {
        this.name = "Apple";
        super.name = "Fruit";
    }
}
