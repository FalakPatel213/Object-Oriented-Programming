import java.util.*;

public class Prime2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int primeCount = sc.nextInt();
        int count = 0;

        for (int i = 0; count < primeCount; i++) {
            int flag = 0;
            if (i == 0 || i == 1) {
                flag = 1;
            }

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(i);
                count++;
            }
        }
    }
}