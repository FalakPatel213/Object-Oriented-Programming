import java.util.*;

public class AllValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter float value : ");
        float fval = sc.nextFloat();
        System.out.println("Entered val is : " + fval);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter string : ");
        String sval = sc1.nextLine();
        System.out.println("Entered val is : " + sval);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Character: ");
        char cval = sc2.next().charAt(0);
        System.out.println("Entered val is : " + cval);
    }
} 

