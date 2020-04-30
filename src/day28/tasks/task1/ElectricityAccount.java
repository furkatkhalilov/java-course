package day28.tasks.task1;

public class ElectricityAccount {
    double totalWph;
    double rate = 2.0;
    double bill;

    public double calculateBill(){
        if(totalWph > 0){
            bill = totalWph * rate;

            return bill;
        }else{
            System.out.println("You did not consume any energy, green world forever!!!");
            return 0.0;
        }

    }
}
