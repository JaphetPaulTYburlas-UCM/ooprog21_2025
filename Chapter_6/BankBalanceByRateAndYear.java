import java.util.*;

 class BankBalanceByRateAndYear
 {
   public static void main(String args[])
   { 
     Scanner scanner = new Scanner(System.in);
     double intRate = 0.02;
  
     
    System.out.println("Enter a balance");
    int balance = scanner.nextInt();
    
    for(int i = 0; i < 4; i++) {
      System.out.println("With an initial balance of: " + balance + " and interest rate of: " + intRate);
      double tmp = balance;
      for(int j = 1; j <= 4; j++) {
        tmp += tmp * intRate;
        System.out.println("After Year " + j + " the balance is: " + tmp);
      }
      intRate += 0.01;
    }
   }
 }
