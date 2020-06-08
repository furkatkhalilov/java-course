package day51.tasks.task1;

import day51.tasks.task1.laptop.AbstractLaptop;
import day51.tasks.task1.phone.AbstractPhone;
import day51.tasks.task1.tablet.AbstractTablet;
import day51.tasks.task1.tv.AbstractTV;

public abstract class AbstractDevice implements Device {
    String name;
    double price;
    String model;
    Condition condition;


    @Override
    public String toString() {
        String info = "\n---" + getClass().getSimpleName() + "---" +
                "\nname:" + name +
                "\nprice:" + price +
                "\nmodel:" + model +
                "\ncondition:" + condition;


        if(this instanceof AbstractPhone) {
            AbstractPhone phone = (AbstractPhone) this;

            info += "\ncareer:" + phone.getCareer().getName();
        } else if(this instanceof AbstractLaptop) {
            AbstractLaptop laptop = (AbstractLaptop) this;

            info += "\nDisplayType:" + laptop.getDisplayType();
            info += "\nRAM:" + laptop.getRAM();
            info += "\nScreenSize:" + laptop.getScreenSize();
        } else if(this instanceof AbstractTablet) {
            AbstractTablet tablet = (AbstractTablet) this;

            info += "\npen:" + (tablet.hasPen() ? "included" : "not included");
        } else if(this instanceof AbstractTV) {
            AbstractTV tv = (AbstractTV) this;

            info += "\nDiagonal:" + tv.getDiagonal();
            info += "\nOS:" + tv.getOs();
        }


        return info;
    }
}
