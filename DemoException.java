
//Question 17
import java.util.Scanner;

public class DemoException extends Exception {
    public DemoException(String string) {
        super(string);
    }

    public static void main(String[] args) {
        String name = null;
        int empid;
        int depid;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Name");
            name = sc.nextLine();
            if (!(Character.isUpperCase(name.charAt(0)))) {
                throw new DemoException("First Letter should have only Capital");
            }
            System.out.println("Enter EmpId");
            empid = sc.nextInt();
            if (!(empid >= 2001 && empid <= 5001)) {
                throw new DemoException("Empid should be between 2001 and 5001");
            }
            System.out.println("Enter DepId");
            depid = sc.nextInt();
            if (!(depid >= 1 && depid <= 5)) {
                throw new DemoException("depid should be between 0 and 5");
            }
            System.out.println("All data is valid");
            System.out.println("Name------------>" + name);
            System.out.println("Empid----------->" + empid);
            System.out.println("DepId----------->" + depid);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you!!");
        }
    }
}
