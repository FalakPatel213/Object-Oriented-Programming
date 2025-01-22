import java.util.*;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int sum = digitSum(num);
        System.out.println("Sum of digit is " + sum);
    }

    public static int digitSum(int num) {
        int rem = 0, sum = 0, temp;
        temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }
}