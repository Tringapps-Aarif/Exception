import java.util.*;

class UnsufficientAmountException extends Exception {

}

class details {
    int accno, bal;
    int currentBalance = 0, depAmt, wAmt;
    String name;
    Scanner sc = new Scanner(System.in);

    details(int acc, String nam) {
        accno = acc;
        name = nam;
    }

    void getData() {
        System.out.println("NAME:" + name);
        System.out.println("ACCOUNT NUMBER:" + accno);
        System.out.println("CURRENT BALANCE:" + currentBalance);
    }

    void deposit() {

        System.out.println("Enter the Amount");
        depAmt = sc.nextInt();
        currentBalance = currentBalance + depAmt;
        getData();

    }

    void widthDrawal() {
        try {
            System.out.println("Enter the you need to widthdraw");
            wAmt = sc.nextInt();
            if (wAmt >= currentBalance) {
                throw new UnsufficientAmountException();
            } else {
                currentBalance = currentBalance - wAmt;
                getData();
            }
        } catch (UnsufficientAmountException e) {
            System.out.println("current balance should be greater than or equal to widthdrawal amount");
        }

    }
}

class BankExp

{
    public static void main(String[] args) {
        {
            int accno, ch = 0;
            String name;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name");
            name = sc.nextLine();
            System.out.println("Enter the Account number:");
            accno = sc.nextInt();

            details D = new details(accno, name);
            while (ch != 3) {

                System.out.println("Enter your choice \n1.DEPOSIT \n2.WIDTHDRAW");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        D.deposit();
                        break;
                    case 2:
                        D.widthDrawal();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("invalid choice");
                        break;
                }
            }
        }
    }
}