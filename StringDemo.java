//Question 9
public class StringDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        int ln;
        ln = sb.length();
        char ch, c;
        for (int i = 0; i < ln; i++) {
            c = 0;
            ch = sb.charAt(i);
            ch = Character.toUpperCase(ch);
            switch (ch) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    c++;
                    break;
            }
            if (c > 0) {
                sb.deleteCharAt(i);
                ln--;
            }
        }
        System.out.println(sb);
    }
}
/*
 * Output:
 * Hll Wrld
 */