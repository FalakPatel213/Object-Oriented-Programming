public class LargestF {
    public static void main(String args[]) {
        int a[] = new int[] { 23, 234, 69, 40 };
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("The max number is " + max);
    }
}
