import java.util.Scanner;

public class TaxCalculator {

    public double calculateTax(double income) {
        if (income <= 250000) {
            return 0;
        } else if (income <= 500000) {
            return 0.05 * (income - 250000);
        } else if (income <= 1000000) {
            return 0.05 * 250000 + 0.20 * (income - 500000);
        } else {
            return 0.05 * 250000 + 0.20 * 500000 + 0.30 * (income - 1000000);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your annual income: ");
        double income = scanner.nextDouble();
        TaxCalculator calculator = new TaxCalculator();
        double tax = calculator.calculateTax(income);
        System.out.println("Your calculated tax is: ₹" + String.format("%.2f", tax));
        scanner.close();
    }
}
