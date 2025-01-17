import java.util.Arrays;

public class LargestInArr {

    public static void main(String args[]) {

        int a[] = new int[] { 20, 30, 50 };
        int max = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }

        }
        System.out.println("Maximum element is " + max);

    }

}
