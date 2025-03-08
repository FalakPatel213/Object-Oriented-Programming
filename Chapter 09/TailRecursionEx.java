import java.util.*;

public class TailRecursionEx {
    static int printNum (int n) {
        if (n < 1) {
            return 0;

        } else {
            System.out.println(n);
            return printNum (n / 2);

        }
    }

    public static void main (String[] args) {
        int n;
        System.out.println("Enter num : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int result = printNum(n);
        System.out.println("Last return number is " + result);
    }
}