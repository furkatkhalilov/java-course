package day49.interfaceKeyword;

//to implement from multiple interfaces just put comma and write other interfaces
public class ToyotaPrius implements Electric, Gas {

    @Override
    public String changeBattery() {
        return "change every 1 year";
    }

    @Override
    public String changeOil() {
        return "change every 3 month";
    }
}
