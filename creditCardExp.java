import java.util.*;

class cardExp extends Exception {

}

class cardDetails implements Cloneable {
    String ogName;
    String ogCardNo;
    String ogExpDate;

    cardDetails(String ogName, String ogCardNo, String ogExpDate) {
        this.ogName = ogName;
        this.ogCardNo = ogCardNo;
        this.ogExpDate = ogExpDate;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    boolean equals(String cardNo) {

        if (ogCardNo == cardNo)
            return true;
        else
            return false;
    }

    void display() {
        System.out.println(
                "Card holder name : " + ogName + "\nCard number : " + ogCardNo + "\nCard Expiry date : " + ogExpDate);
    }
}

class creditCardExp {
    public static void main(String args[]) throws CloneNotSupportedException {
        try {
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            Scanner sc3 = new Scanner(System.in);

            System.out.println("Enter Original card details this details will be cloned ");
            System.out.printf("Enter Card Holder Name : ");
            String ogName = sc.nextLine();
            System.out.printf("Enter Card Number : ");
            String ogCardNo = sc.next();
            if (ogCardNo.length() != 16) {
                throw new cardExp();
            }
            System.out.printf("Enter Expiry Date :");
            String ogExpDate = sc1.nextLine();
            cardDetails obj1 = new cardDetails(ogName, ogCardNo, ogExpDate);
            cardDetails obj2 = (cardDetails) obj1.clone();
            System.out.println("Enter Card Details to check: \n");
            System.out.printf("Enter Card Holder Name : ");
            String name = sc1.nextLine();
            System.out.printf("Enter Card Number : ");
            String cardNo = sc1.next();
            if (cardNo.length() != 16) {
                throw new cardExp();
            }
            System.out.printf("Enter Expiry Date : ");
            String expDate = sc3.nextLine();
            cardDetails obj3 = new cardDetails(name, cardNo, expDate);
            System.out.println("\nThe original card details\n");
            obj1.display();
            System.out.println("\nCloned card details\n");
            obj2.display();
            System.out.println("\nThe card details we checked\n");
            obj3.display();
            boolean ans = obj2.equals(cardNo);
            if (ans == true) {
                System.out.println("\nBoth card details are same\n");
            } else {
                System.out.println("\nBoth card details are not same\n");
            }

        } catch (cardExp e) {
            System.out.println("The card number must be 16 digits");
        }

    }
}
