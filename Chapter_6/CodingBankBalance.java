import java.util.*;

public class CodingBankBalance{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance;
        double interestRate = 0.03;
        int year = 1;
        String choice = "1";

        System.out.println("Enter Intial Bank Balance: ");
        balance = input.nextDouble();

        while(choice.equalsIgnoreCase("1")){
            
            balance = balance + (balance * interestRate);
                System.out.printf("Year %d balance : %.2f%n", year, balance );

                year++;

            System.out.println("Do you want to contanue for another year enter 1 for yes? enter random number for no: ");
            choice = input.next();
        }
        System.out.println("Final Balance: "+ String.format("%.2f", balance));
        System.out.println("Program Ended");
        input.close();
    }
}
