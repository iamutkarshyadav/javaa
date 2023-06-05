import java.util.*;

public class ZeroOne {
    public static void main(String[] args) {
        int number, tnum;
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = sr.nextInt();
        tnum = number;
        int result = 0;
        int decimalPlace = 1;

        if (number == 0) {
            result += (1 * decimalPlace);
        }
        while (number > 0) {
            if (number % 10 == 0)
                result += (1 * decimalPlace);
            number /= 10;
            decimalPlace *= 10;
        }
        tnum += result;
        System.out.print("Number after replacement : ");
        System.out.print(tnum);
    }
}
/*
 * Output:
 * Enter the number : 109080
 * Number after replacement : 119181
 */