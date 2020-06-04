package day49.interfaceKeyword;

public class HondaInsight implements Electric, Gas {

    @Override
    public String changeBattery() {
        return "change every 1,5 year";
    }

    @Override
    public String changeOil() {
        return "change every 5 month";
    }
}
