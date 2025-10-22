import java.util.Scanner;

public class CodingBankBalance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance;
        final double INTEREST_RATE = 0.03; // 3%
        int year = 1;
        char choice;

        // Get initial balance from the user
        System.out.print("Enter the initial balance: $");
        balance = scanner.nextDouble();

        do {
            // Calculate interest
            double interest = balance * INTEREST_RATE;

            // Update balance
            balance += interest;

            // Display current year's balance
            System.out.printf("Year %d - Interest: $%.2f - New Balance: $%.2f%n", year, interest, balance);

            year++; // increment year

            // Ask user if they want to continue
            System.out.print("Do you want to calculate next year's interest? (Y/N): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thank you for using the Bank Interest Calculator.");
        scanner.close();
    }
}
