//Question 10
import java.util.*;

public class Bank {
    private int accountno;
    private String personname;
    private String address;
    private double balance;

    public void InputInfo(String pname, String add, double bal, int acno) {
        personname = pname;
        address = add;
        balance = bal;
        accountno = acno;
    }

    public void showInfo() {
        System.out.println("PersonName=> " + personname);
        System.out.println("Address=> " + address);
        System.out.println("AccountNumber=> " + accountno);
        System.out.println("Balance=> " + balance);
    }

    public void deposit(double amt) {
        balance = balance + amt;
    }

    public void withdraw(double amt) {
        if (balance > amt)
            balance = balance - amt;
        else
            System.out.println("Insufficant Balance");
    }

    public int getAccountNo() {
        return accountno;
    }

    public double getBalance() {
        return balance;
    }

    public String getAddress() {
        return address;
    }

    public void changeAddress(String add) {
        address = add;
    }

    public static void main(String[] args) {
        int size, i, f;
        char ans;
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter Number of New depositor");
        size = sr.nextInt();
        System.out.println("Press Any Key For Entering Depositor Information");
        ans = sr.next().charAt(0);
        Bank ob[] = new Bank[size];
        int acno = 1000;
        String pname;
        String add;
        double amt;
        for (i = 0; i < size; i++) {
            ob[i] = new Bank();
            System.out.println("Enter depositor name ");
            pname = sr.next();
            System.out.println("Enter Address ");
            add = sr.next();
            System.out.println("Enter Amount ");
            amt = sr.nextDouble();
            acno = acno + 1;
            ob[i].InputInfo(pname, add, amt, acno);
        }
        for (;;) {
            System.out.println("1-Display information and balance of Depositor");
            System.out.println("2-Deposit more amount in balance of any depositor");
            System.out.println("3-Withdraw some amount from balance deposited");
            System.out.println("4-Change address of depositor");
            System.out.println("Enter Choice ");
            int ch = sr.nextInt();
            switch (ch) {
                case 1:
                    f = 0;
                    System.out.println("Enter depositor acountno ");
                    acno = sr.nextInt();
                    for (i = 0; i < size; i++) {
                        if (acno == ob[i].getAccountNo()) {
                            ob[i].showInfo();
                            f = 1;
                            break;
                        }
                    }
                    if (f == 0) {
                        System.out.println("Invalid AcountNo ");
                    }
                    break;

                case 2:
                    f = 0;
                    System.out.println("Enter depositor acountno ");
                    acno = sr.nextInt();
                    for (i = 0; i < size; i++) {
                        if (acno == ob[i].getAccountNo()) {
                            System.out.println("Enter Deposit Amount ");
                            amt = sr.nextDouble();
                            ob[i].deposit(amt);
                            System.out.println("After Deposit Amount is " + ob[i].getBalance());
                            f = 1;
                            break;
                        }
                    }
                    if (f == 0) {
                        System.out.println("Invalid AcountNo ");
                    }
                    break;
                case 3:
                    f = 0;
                    System.out.println("Enter depositor acountno ");
                    acno = sr.nextInt();
                    for (i = 0; i < size; i++) {
                        if (acno == ob[i].getAccountNo()) {
                            System.out.println("Enter Withdraw Amount ");
                            amt = sr.nextDouble();
                            ob[i].withdraw(amt);
                            System.out.println("After withdraw Amount is " + ob[i].getBalance());
                            f = 1;
                            break;
                        }
                    }
                    if (f == 0) {
                        System.out.println("Invalid AcountNo ");
                    }
                    break;
                case 4:
                    f = 0;
                    System.out.println("Enter depositor acountno ");
                    acno = sr.nextInt();
                    for (i = 0; i < size; i++) {
                        if (acno == ob[i].getAccountNo()) {
                            System.out.println("Enter New Address ");
                            add = sr.nextLine();
                            ob[i].changeAddress(add);
                            System.out.println("After Change New Address=> " + ob[i].getAddress());
                            f = 1;
                            break;
                        }
                    }
                    if (f == 0) {
                        System.out.println("Invalid AcountNo ");
                    }
                    break;
            }
            System.out.print("Want to do More transcation Y/N ");
            ans = sr.next().charAt(0);
            if (ans == 'N' || ans == 'n') {
                break;
            }
        }
    }
}
/*
 * Output:
 * Enter Number of New depositor
 * 2
 * Press Any Key For Entering Depositor Information
 * s
 * Enter depositor name
 * Utkarsh
 * Enter Address
 * xyz
 * Enter Amount
 * 5000
 * Enter depositor name
 * Thomas
 * Enter Address
 * Ajab
 * Enter Amount
 * 3000
 * 1-Display information and balance of Depositor
 * 2-Deposit more amount in balance of any depositor
 * 3-Withdraw some amount from balance deposited
 * 4-Change address of depositor
 * Enter Choice
 * 1
 * Enter depositor acountno
 * 1001
 * PersonName=> Utkarsh
 * Address=> xyz
 * AccountNumber=> 1001
 * Balance=> 5000.0
 * Want to do More transcation Y/N y
 * 1-Display information and balance of Depositor
 * 2-Deposit more amount in balance of any depositor
 * 3-Withdraw some amount from balance deposited
 * 4-Change address of depositor
 * Enter Choice
 * 2
 * Enter depositor acountno
 * 1001
 * Enter Deposit Amount
 * 4500
 * After Deposit Amount is 9500.0
 * Want to do More transcation Y/N y
 * 1-Display information and balance of Depositor
 * 2-Deposit more amount in balance of any depositor
 * 3-Withdraw some amount from balance deposited
 * 4-Change address of depositor
 * Enter Choice
 * 3
 * Enter depositor acountno
 * 1001
 * Enter Withdraw Amount
 * 2000
 * After withdraw Amount is 7500.0
 * Want to do More transcation Y/N y
 * 1-Display information and balance of Depositor
 * 2-Deposit more amount in balance of any depositor
 * 3-Withdraw some amount from balance deposited
 * 4-Change address of depositor
 * Enter Choice
 * 1
 * Enter depositor acountno
 * 1001
 * PersonName=> Utkarsh
 * Address=> xyz
 * AccountNumber=> 1001
 * Balance=> 7500.0
 * Want to do More transcation Y/N y
 * 1-Display information and balance of Depositor
 * 2-Deposit more amount in balance of any depositor
 * 3-Withdraw some amount from balance deposited
 * 4-Change address of depositor
 * Enter Choice
 * 1
 * Enter depositor acountno
 * 1002
 * PersonName=> Thomas
 * Address=> Ajab
 * AccountNumber=> 1002
 * Balance=> 3000.0
 * Want to do More transcation Y/N y
 * 1-Display information and balance of Depositor
 * 2-Deposit more amount in balance of any depositor
 * 3-Withdraw some amount from balance deposited
 * 4-Change address of depositor
 * Enter Choice
 * 2
 * Enter depositor acountno
 * 1002
 * Enter Deposit Amount
 * 2500
 * After Deposit Amount is 5500.0
 * Want to do More transcation Y/N n
 */