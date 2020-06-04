package day49.interfaceKeyword;


//to create interface , use keyword 'interface'
//every field and method has public access modifier by default
public interface Electric {
    //TODO in interface every field is 'public final' by default
    public final int batteryLife = 100;

    //interface doesn't allow constructor
    //Electric(){}

    //TODO in interface every method is 'public abstract' by default
    public abstract String changeBattery();

    //interface doesn't allow non-abstract method except static methods
    //public void print(){}

    //TODO static methods are allowed
    public static void print() {
        System.out.println("Electric");
    }

}
