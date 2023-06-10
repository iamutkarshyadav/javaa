//Question 2

import java.util.Scanner;

public class BankDeposit {
    public static void main(String[] args) {
        int choice = 0;
        double maturityAmount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Term Deposit");
        System.out.println("Press 2 for Recurring Deposit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter principal: ");
                double P1 = sc.nextDouble();
                System.out.print("Enter rate of interest: ");
                double r1 = sc.nextDouble();
                System.out.print("Enter period in years: ");
                double n1 = sc.nextDouble();
                /* maturity amount = p*((1+r1)/100)^n1 */
                maturityAmount = P1 * Math.pow(1 + r1 / 100.0, n1);
                System.out.println("Maturity Amount is " + maturityAmount);
                break;
            case 2:
                System.out.print("Enter monthly installment: ");
                double P2 = sc.nextDouble();
                System.out.print("Enter rate of interest: ");
                double r2 = sc.nextDouble();
                System.out.print("Enter period in months: ");
                double n2 = sc.nextDouble();
                maturityAmount = P2 * n2 + P2 * (n2 * (n2 + 1) / 2.0) * (r2 / 100.0) * (1.0 / 12);
                System.out.println("Maturity Amount is " + maturityAmount);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
