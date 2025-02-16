// Method overloading by changing the number of arguments

// public class MethodOverLoading{
//     public static int  add(int a, int b){
//         return a + b;
//     }

//     public static int add(int a, int b, int c){
//         return a + b + c;
//     } 

//     public static void main(String args[]){
//         System.out.println(add(10, 20));
//         System.out.println(add(10, 20, 30));
//     }
// }


// Method Overloading by changing the data type of arguments

public class MethodOverLoading{
    public static int add(int a, int b){
        return a + b;
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static void main(String args[]){
        System.out.println(add(10, 20));
        System.out.println(add(10.5, 20.5));
    }
}