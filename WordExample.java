//Question 11
import java.util.*;

class WordExample {
    private String strdata;

    public WordExample(String str)// Constructor
    {
        strdata = str;
    }

    public void wordCount() {
        int i, ln, wln, c1, c2, c = 0;
        String tmp;
        char ch1, ch2;
        ln = strdata.length();
        for (i = 0; i < ln; i++) {
            tmp = "";
            c1 = 0;
            c2 = 0;

            for (; strdata.charAt(i) != ' '; i++) {
                if (i == (ln - 1)) {
                    break;
                }
                tmp = tmp + strdata.charAt(i);

            }
            if (!tmp.isEmpty()) {
                wln = tmp.length();
                ch1 = tmp.charAt(0);
                ch2 = tmp.charAt(wln - 1);
                switch (ch1) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        c1++;
                }
                switch (ch2) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        c2++;
                }
                if (c1 == 1 && c2 == 1)
                    c++;
            }
        }
        System.out.println("Number Of Words Are= " + c);
    }

    public void placeWord() {
        int i, ln, wln, c1, c2, c = 0;
        String tmp, fstr = "", lstr = "";
        char ch1, ch2;
        ln = strdata.length();
        for (i = 0; i < ln; i++) {
            tmp = "";
            c1 = 0;
            c2 = 0;

            for (; strdata.charAt(i) != ' '; i++) {
                if (i == (ln - 1)) {
                    break;
                }
                tmp = tmp + strdata.charAt(i);

            }
            if (!tmp.isEmpty()) {
                wln = tmp.length();
                ch1 = tmp.charAt(0);
                ch2 = tmp.charAt(wln - 1);
                switch (ch1) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        c1++;
                }
                switch (ch2) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        c2++;
                }
                if (c1 == 1 && c2 == 1)
                    fstr = fstr + tmp + " ";
                else
                    lstr = lstr + tmp + " ";
            }
        }
        tmp = fstr + lstr;
        tmp = tmp.trim();
        tmp = tmp + ".";
        System.out.println(tmp);
    }

    public static void main(String args[]) {
        Scanner sr = new Scanner(System.in);
        System.out.print("Sentence: ");
        String s = sr.nextLine();
        s = s.trim();
        s = s.toUpperCase();
        int len = s.length();
        char last = s.charAt(len - 1);
        if (last != '.' && last != '?' && last != '!') {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        WordExample ob = new WordExample(s);
        ob.wordCount();
        ob.placeWord();

    }
}
/*
 * Output:
 * Sentence: ADITYA AND ROHAN ARE NEVER GOING TO QUARREL ANYMORE.
 * Number Of Words Are= 3
 * ADITYA ARE ANYMORE AND ROHAN NEVER GOING TO QUARREL.
 * Output:
 * Sentence: how are you
 * INVALID INPUT
 * Output:
 * Sentence: How are You?
 * Number Of Words
 */