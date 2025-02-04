public class MultiDimentional {

    public static void main(String args[]) {

        int[][][] arr = { { { 10, 20 }, { 30, 40 } }, { { 50, 60 }, { 80, 70 } } };
        int[][] arr2 = { { 10, 20 }, { 30, 40 } };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
