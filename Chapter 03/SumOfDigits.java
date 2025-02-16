import java.util.*;

public class SumOfDigits{
    public static int DigitSum(int a){
        int sum = 0;
        while(a != 0){
            int b = a % 10;
            sum = sum + b;
            a = a / 10;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("The sum of the digits of the number is : " + DigitSum(a));
    }
}