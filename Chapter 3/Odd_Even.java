import java.util.*;

public class Odd_Even {
    public static void main(String args[]) {
        int a[] = new int[] { 12, 13, 15, 16, 17 };
        int k = 0, l = 0;
        int even[] = new int[10];
        int odd[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even[k] = a[i];
                k++;
            } else {
                odd[l] = a[i];
                l++;
            }
        }
        System.out.print("Even = ");
        for (int i = 0; even[i] != 0; i++) {
            System.out.print(even[i] + "  ");
        }
        System.out.print("\n");
        System.out.print("Odd = ");
        for (int i = 0; odd[i] != 0; i++) {
            System.out.print(odd[i] + "  ");
        }
    }
}
