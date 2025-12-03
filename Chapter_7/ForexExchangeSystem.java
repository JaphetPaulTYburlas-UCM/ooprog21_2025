import java.util.Scanner;

public class ForexExchangeSystem {

    static String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};

    static double[][] rates = {
            {58.20, 58.50, 58.40, 58.60, 58.55},
            {62.10, 61.65, 62.25, 62.00, 62.30},
            {0.46, 0.45, 0.47, 0.46, 0.48},
            {70.80, 71.10,70.95, 71.25, 71.00},
            {40.25, 40.40, 40.35, 40.50, 40.45}
    };

    static void showCurrencyRates(int index) {
        System.out.println("\nCurrency: " + currencies[index]);
        for (int i = 0; i < 5; i++) {
            System.out.println("Rate on Nov " + (i + 1) + ": " + (int)rates[index][i]);
        }
    }

    static void showSummary() {
        System.out.println("\n====================== FOREX SUMMARY (Nov 1 – Nov 5) ======================");
        System.out.println("Currency | Nov1 | Nov2 | Nov3 | Nov4 | Nov5 | Peak | Lowest");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < currencies.length; i++) {
            double peak = rates[i][0];
            double low = rates[i][0];

            for (int j = 0; j < 5; j++) {
                if (rates[i][j] > peak) peak = rates[i][j];
                if (rates[i][j] < low) low = rates[i][j];
            }

            System.out.printf("%-8s | ", currencies[i]);
            for (int j = 0; j < 5; j++) {
                System.out.printf("%.2f | ", rates[i][j]);
            }
            System.out.printf("%.2f | %.2f\n", peak, low);
        }
    }

    static void showDailyChanges() {
        System.out.println("\n====== DAILY CHANGES (Comparison From Previous Day) ======");
        System.out.println("(+ increase / - decrease / no change for same value)");

        for (int i = 0; i < currencies.length; i++) {
            System.out.println("\nCurrency: " + currencies[i]);
            for (int j = 1; j < 5; j++) {
                double diff = rates[i][j] - rates[i][j - 1];

                String sign;
                if (diff > 0) sign = "+";
                else if (diff < 0) sign = "-";
                else sign = "No Change";

                if (sign.equals("No Change")) {
                    System.out.printf("Nov %d -> Nov %d: %s\n", j, j + 1, sign);
                } else {
                    System.out.printf("Nov %d -> Nov %d: %s %.2f\n", j, j + 1, sign, Math.abs(diff));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a currency to display:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println(i + " - " + currencies[i]);
        }
        System.out.print("Enter number: ");
        int choice = sc.nextInt();

        showCurrencyRates(choice);
        showSummary();
        showDailyChanges();
    }
}
