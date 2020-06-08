package day51.tasks.task1;

import day51.tasks.task1.phone.AbstractPhone;

public abstract class AbstractDevice {
    String name;
    double price;
    String model;
    Condition condition;


    @Override
    public String toString() {
        if(this instanceof AbstractPhone) {

        }


        return "\n---" + getClass().getSimpleName() + "---" +
                "\nname:" + name +
                "\nprice:" + price +
                "\nmodel:" + model +
                "\ncondition:" + condition;
    }
}
