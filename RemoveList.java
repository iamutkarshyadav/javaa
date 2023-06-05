
//Question 21
import java.util.ArrayList;

class ArrayListData {
    public static void removeEvenLength(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            String word = array.get(i);
            if (word.length() % 2 == 0) {
                array.remove(i);
                i--;
            }
        }
    }
}

public class RemoveList {
    public static void main(String[] args) {
        // create an empty array list with an initial capacity
        ArrayList<String> arrlist = new ArrayList<String>(5);
        // use add() method to add elements in the list
        arrlist.add("Java");
        arrlist.add("C++");
        arrlist.add("DataScience");
        arrlist.add("Python");
        arrlist.add("Cyber");
        System.out.println("<====ArrayList Item====>");
        for (String str : arrlist) {
            System.out.println(str);
        }
        ArrayListData.removeEvenLength(arrlist);
        System.out.println("<====After Removing EvenLength ArrayList Item====>");
        for (String str : arrlist) {
            System.out.println(str);
        }
    }
}
