//Question17

import java.util.Scanner;

class MyCalculator {
    int power(int n, int p) throws Exception {
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else {
            return (int) Math.pow(n, p);
        }
    }
}

class Excep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Value Of n and p ");
        int n = in.nextInt();
        int p = in.nextInt();
        MyCalculator M = new MyCalculator();
        try {
            System.out.println(M.power(n, p));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
