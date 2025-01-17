public class JaggedArray {
    public static void main(String[] args) {
        int myArray[][] = new int[3][];

        myArray[0] = new int[]{10, 20, 30};
        myArray[1] = new int[]{40, 50};
        myArray[2] = new int[]{60, 70, 80, 90};

        System.out.println("The two dimentional jagged array: ");

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println(" ");
        }

    }
}

// In jagged array, in each and every row there is no fixed number of columns.
// Number of rows is fixed in Jagged array.