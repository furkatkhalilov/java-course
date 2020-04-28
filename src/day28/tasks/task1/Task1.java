package day28.tasks.task1;

public class Task1 {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.name = "Danny";

        ElectricityAccount account = new ElectricityAccount();
        account.wph = 200;
        account.bill = 500;

        customer1.electricityAccount = account;

    }
}
