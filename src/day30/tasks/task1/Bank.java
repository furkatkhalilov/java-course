package day30.tasks.task1;

public class Bank {
    String name;
    int serial;
    boolean trustworthiness;

    // First
    public Bank() {
        name = "Unknown";
    }
    // Second
    public Bank(String name, int serial) {
        this.name = name;
        this.serial = serial;
    }
    // Third
    public Bank(String name, int serial, boolean trustworthiness) {
        this(name, serial);
        this.trustworthiness = trustworthiness;
    }

    public String toString() {
        return "\n---------------------------" +
                "\nName: " + this.name +
                "\nSerial: " + this.serial +
                "\nTrustworthiness: " + this.trustworthiness +
                "\n---------------------------"
                ;

    }
}
