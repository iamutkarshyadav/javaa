//Question 3
import java.util.*;

public class FriendlyPair {
    public static void main(String[] args) {
        int i, num1, num2;
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        num1 = sr.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = sr.nextInt();
        int sum1 = 0, sum2 = 0;
        for (i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sum1 = sum1 + i;
            }
        }
        for (i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                sum2 = sum2 + i;
            }
        }
        if (sum1 == num1 && sum2 == num2)
            System.out.print("Friendly Pair");
        else
            System.out.print("Not Friendly Pair");
    }
}
/*
 * Output:
 * Enter First Number: 6
 * Enter Second Number: 28
 * Friendly Pair
 */
