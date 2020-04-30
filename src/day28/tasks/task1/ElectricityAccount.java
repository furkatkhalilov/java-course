package day28.tasks.task1;

public class ElectricityAccount {
    double totalWph;
    double rate = 0.7;
    double bill;

    //  bill is rate * totalWph
    double calculateBill() {
        bill = rate * totalWph;

        return bill;
    }
}
