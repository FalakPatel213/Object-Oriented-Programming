import java.util.*;

public class PalF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        int rev = 0, pal = a, num;
        while (a > 0) {
            num = a % 10;
            rev = (rev * 10) + num;
            a = a / 10;
        }
        if (pal == rev) {
            System.out.println("The number is Palindrom.");
        } else {
            System.out.println("The number is not Palindrom.");
        }
    }
}
