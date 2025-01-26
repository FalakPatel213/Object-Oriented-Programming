import java.util.*;

public class Calculator2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double x = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double y = sc.nextDouble();

        System.out.println("Enter the operator: ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("The addition of " + x + " and " + y + " is " + (x + y) + ".");
                break;
            case '-':
                System.out.println("The subtraction of " + x + " and " + y + " is " + (x - y) + ".");
                break;
            case '*':
                System.out.println("The multiplication of " + x + " and " + y + " is " + (x * y) + ".");
                break;
            case '/':
                System.out.println("The division of " + x + " and " + y + " is " + (x / y) + ".");
                break;
        }
    }
}