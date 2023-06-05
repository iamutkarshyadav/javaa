//Question 18

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFile {
    public static void main(String a[]) {
        BufferedReader br = null;
        String strLine = "";
        String revword;
        int c = 0;
        try {
            br = new BufferedReader(new FileReader("D:/newquestion/myfile.txt"));
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
                String st[] = strLine.split(" ");
                for (String tmp : st) {
                    StringBuffer data = new StringBuffer(tmp);
                    data.reverse();
                    revword = data.toString();
                    if (tmp.equalsIgnoreCase(revword)) {
                        c++;
                    }
                }
            }
            System.out.println("Total number of palindrome in a given file are=> " + c);
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
