import java.util.*;

class gpaException extends Exception {

}

class cal {
    String name;
    double gpa = 0, newGpa;

    cal(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    void update(double newGpa) {
        gpa = newGpa;
    }

    void putData() {
        System.out.println(name + " has " + gpa + " GPA ");

    }
}

class studentsExp {
    public static void main(String args[]) {
        String name;

        double gpa;
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Student's name : ");
        name = sc.nextLine();
        try {

            System.out.print("Enter the Grade \nA press 5 \nB press 4 \nC press 3 \nD press 2 \nE press 1 \n");
            gpa = sc.nextInt();
            if (gpa > 6) {
                throw new gpaException();

            }
            cal ob = new cal(name, gpa);
            ob.putData();
            while (ch != 2) {
                System.out.println("IF YOU NEED TO UPDATE ENTER '1' \nIF YOU NEED TO EXIT ENTER '2' \n");
                ch = sc.nextInt();
                switch (ch) {
                    case 1: {
                        System.out.print("Enter the correct Grade : ");
                        double newGpa = sc.nextDouble();
                        ob.update(newGpa);
                        ob.putData();
                    }
                        break;

                    case 2:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
        }

        catch (gpaException e) {
            System.out.println("The gpa should be less than six");
        }

    }
}