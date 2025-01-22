import java.util.*;

public class ArmF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int pal = num, a, arm = 0;
        while (num > 0) {
            a = num % 10;
            arm = arm + (a * a * a);
            num = num / 10;
        }
        if (pal == arm) {
            System.out.println("The number is Armstrong.");
        } else {
            System.out.println("The number is not Armstrong");
        }
    }
}
