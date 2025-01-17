// Implement java code to take some (eg. 10) String form users put all the i/p strings in an array(String name[])provide implementation of following method

//      (i) Search (String S) will return index of String passsed in method if string S is found in name, otherwise return 1.
//      (ii) Sort() will print sorted string array to user

// marks of this que. is [7]

import java.util.*;

public class StringArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[10];
        System.out.println("Enter the string : ");
        for (int i = 0; i < 10; i++) {
            System.out.println("String " + (i + 1) + ": ");
            name[i] = sc.nextLine();
        }
        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Search for string");
            System.out.println("2. Sort & display String");
            System.out.println("3. Exit");
            System.out.println("Choose an option : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter string to search : ");
                    String searchString = sc.nextLine();
                    int idx = search(name, searchString);
                    if (idx != -1) {
                        System.out.println("String found at index : " + idx);
                    } else {
                        System.out.println("String not found");
                    }
                    break;
                case 2:
                    sort(name);
                    System.out.println("Sorted string : " + Arrays.toString(name));
                    break;
                case 3:
                    System.out.println("Exiting");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. please try again");
            } // Switch end
        } // While end
    } // main

    public static int search(String[] name, String s) {
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(s)) {
                return i;
            }
        }
        return -1;
    }

    public static void sort(String[] name) {
        Arrays.sort(name);
    }
}