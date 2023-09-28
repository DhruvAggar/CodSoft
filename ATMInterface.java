
import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args) {
        int debit, credit;

        Scanner sc = new Scanner(System.in);
        int pass = sc.nextInt();
        // if(pass == 1973 ){
        // System.out.println("Welcome Mr.ABC");
        // }else{
        // System.out.println("Invalid Password");
        //// System.out.println("Please try again");
        // }
        if (pass == 1973) {
            System.out.println("Welcome ABC");
            double balance = 1000000;
            System.out.println("Choose 1 for debit amount");
            System.out.println("Choose 2 for credit amount");
            System.out.println("Choose 3 for check Balance");
            System.out.println("Choose 4 for exit");
            System.out.println("Select one option");
            int s = sc.nextInt();
            switch (s) {
                case 1:
                    System.out.println("Enter the amount");
                    debit = sc.nextInt();
                    if (debit <= balance) {
                        balance -= debit;
                        System.out.println("Remaining balance = " + balance);
                    } else {
                        System.out.println("insufficient Balance");
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount to credit");
                    credit = sc.nextInt();
                    balance += credit;
                    System.out.println("Remaining balance = " + balance);
                    break;
                case 3:
                    System.out.println("Balance = " + balance);
                    break;
                case 4:
                    System.out.println("Transaction completed");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println("Thank you for visiting us");
        } else {
            System.out.println("Invalid Password");
            // System.out.println("Please try again");
        }

        if (pass == 1234) {
            double balance = 10000;
            System.out.println("Welcome XYZ");
            System.out.println("Choose 1 for debit amount");
            System.out.println("Choose 2 for credit amount");
            System.out.println("Choose 3 for check Balance");
            System.out.println("Choose 4 for exit");
            System.out.println("Select one option");
            int s = sc.nextInt();
            switch (s) {
                case 1:
                    System.out.println("Enter the amount");
                    debit = sc.nextInt();
                    if (debit <= balance) {
                        balance -= debit;
                        System.out.println("Remaining balance = " + balance);
                    } else {
                        System.out.println("insufficient Balance");
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount to credit");
                    credit = sc.nextInt();
                    balance += credit;
                    System.out.println("Remaining balance = " + balance);
                    break;
                case 3:
                    System.out.println("Balance = " + balance);
                    break;
                case 4:
                    System.out.println("Transaction completed");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println("Thank you for visiting us");
        }
    }
}
