import java.lang.reflect.Array;

public class ReturnArray {
    static int[] get() {
        int arr[] = { 10, 20, 30, 40 };
        return arr;
    }

    public static void main(String args[]) {
        int array[] = get();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
