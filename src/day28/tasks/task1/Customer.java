package day28.tasks.task1;

public class Customer {
    String name;
    ElectricityAccount electricityAccount;


    void consumeElectricity(double wph) {
        electricityAccount.totalWph += wph;
    }
}
