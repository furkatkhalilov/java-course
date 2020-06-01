package day46.abstractKeyword.ex1;


//making class abstract
public abstract class Shape {

    public abstract double getArea();

    @Override
    public String toString() {
        return "\n"
                + getClass().getSimpleName()
                + "\nArea: " + getArea();

    }
}
