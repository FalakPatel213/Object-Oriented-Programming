// Take number from user until 0 is entered by user and print only distinct numbers using ArrayList.

import java.util.*;
// public class PrintDistinctNums {
//     public static void main(String[] args) {
//        ArrayList <Integer> list = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the nunbers : ");
//        int value;
//        while(true){
//         value = sc.nextInt();
//         if(value == 0){
//             sc.close();
//             break;
//         }
//         else{
//             if(list.contains(value)){
//                 continue;
//             }
//             list.add(value);
//         }
//        }
//        System.out.println("-----------------------");
//        for(int i = 0; i < list.size(); i ++){
//         System.out.println(list.get(i) + " ");
//        }
//     }
// }


public class PrintDistinctNums {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nunbers : ");
        int value;
        do{
            value = sc.nextInt();
            if(!list.contains(value) && value != 0){
                list.add(value);
            }
        }while(value != 0);
        sc.close();
        for(int i = 0; i < list.size(); i ++){
            System.out.println(list.get(i) + " ");
        }
    }
}