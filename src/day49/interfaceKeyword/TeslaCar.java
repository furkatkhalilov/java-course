package day49.interfaceKeyword;

//to inherit from interface use keyword 'implements'
public class TeslaCar implements Electric {

    @Override
    public String changeBattery() {
        return "change every 2 years";
    }

}
