import java.util.Scanner;

public class Recursion {
    static int fact (int n) {
        if ( n == 1) {
            return 1;
        } else {
            return n * fact (n - 1);
        }
    }
    public static void main (String[] args) {
        int n;
        System.out.println("Enter the nubmer : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int result = fact(n);
        System.out.println("Factorial = " + result);
    }
}
