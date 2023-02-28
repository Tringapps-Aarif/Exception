import java.util.*;

class pointExp extends Exception {

}

class point implements Cloneable {
    int x1, y1;

    point(int x, int y) {
        x1 = x;
        y1 = y;
    }

    public Object clone() throws CloneNotSupportedException

    {
        return super.clone();
    }

    boolean equals(int x, int y) {
        boolean result = ((x1 == x) && (y1 == y)) ? true : false;
        return result;
    }
}

class cloneExp {
    public static void main(String args[]) throws CloneNotSupportedException {

        try {

            Scanner sc = new Scanner(System.in);

            System.out.println(" Enter 1st Points : \n");
            System.out.println("\n Enter X  : ");

            int x = sc.nextInt();
            if (x < 0) {
                throw new pointExp();
            }
            System.out.println("Enter Y : ");
            int y = sc.nextInt();
            if (y < 0) {
                throw new pointExp();
            }
            point ob = new point(x, y);
            point ob1 = (point) ob.clone();

            System.out.println("\nEnter 2nd points: \n");
            System.out.println("\nEnter X : ");
            int A = sc.nextInt();
            if (A < 0) {
                throw new pointExp();
            }
            System.out.println(" Enter Y : ");
            int B = sc.nextInt();
            if (B < 0) {
                throw new pointExp();
            }
            boolean ans = ob1.equals(A, B);
            System.out.println(" the both points are " + (ans ? "same" : "not same"));

        }

        catch (pointExp e) {
            System.out.println("co-ordinates should have the  positive values");
        }
    }
}