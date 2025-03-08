import java.util.*;

public class NonTailRecursion {
    static int printNumber (int n) {
        if (n < 1) {
            return 0;
        } else {
            System.out.println(" " + n);
            printNumber(n / 2);
            System.out.println(" " + n);
            return n;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        printNumber(n);
        sc.close();
    }
}