import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
        System.out.println("Enter 1 to add, 2 to subtract, 3 to multiply, 4 to divide.");
        System.out.println("Enter the number: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int ans1 = x + y;
                System.out.println("The addition of " + x + " and " + y + " is " + ans1 + ".");
                break;
            case 2:
                int ans2 = x - y;
                System.out.println("The subtraction of " + x + " and " + y + " is " + ans2 + ".");
                break;
            case 3:
                int ans3 = x * y;
                System.out.println("The multiplication of " + x + " and " + y + " is " + ans3 + ".");
                break;
            case 4:
                float ans4 = (float) x / y;
                System.out.println("The division of " + x + " and " + y + " is " + ans4 + ".");
                break;
        }
    }
}