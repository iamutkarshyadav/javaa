//Question 22
import java.util.*;

class PairDemo {
    public static void swapPairs(ArrayList<String> list) {
        for (int i = 0; i <= list.size() - 2; i += 2) {
            String str = list.get(i + 1);
            list.set(i + 1, list.get(i));
            list.set(i, str);
        }
    }
}

public class SPair {
    public static void main(String[] args) {
        int n;
        String str;
        Scanner sr = new Scanner(System.in);
        ArrayList<String> arrlist = new ArrayList<String>();
       
        System.out.println("Enter Number of Item to Added in ArrayList");
        n = sr.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Item ");
            str = sr.next();
            arrlist.add(str);
        }
        System.out.println("<====Before Switches ArrayList Item====>");
        System.out.println(arrlist.toString());
        PairDemo.swapPairs(arrlist);
        System.out.println("<====After Switches ArrayList Item====>");
        System.out.println(arrlist.toString());
    }
}
