public class PassArray {
    static void ArrayPass(int arr[]) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Min is: " + min);
    }

    public static void main(String[] args) {
        int a[] = {10, 2, 30, 12};

        ArrayPass(a);
    }
}