//Question 8
import java.util.*;

public class Pattern {
    static int find_pattern(char str[]) {
        char last = str[0];
        int i = 1, counter = 0;
        while (i < str.length) {
            if (str[i] == '1' && last == '0') {
                while (str[i] == '1')
                    i++;
                if (str[i] == '0')
                    counter++;
            }
            last = str[i];
            i++;
        }
        return counter;
    }

    public static void main(String args[]) {
        String string;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        string = sc.next();
        char[] str = string.toCharArray();
        System.out.print("Number of patterns : " + find_pattern(str));
    }
}
/*
 * Output:
 * Enter the string : 0110110011010
 * Number of patterns : 4
 */