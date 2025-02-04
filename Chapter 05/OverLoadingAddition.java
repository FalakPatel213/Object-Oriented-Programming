// Compile time polymorphism.

// Method overloading changing number of argument.

public class OverLoadingAddition {
    int Add(int a, int b) {
        return a + b;
    }

    int Add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        OverLoadingAddition r = new OverLoadingAddition();
        System.out.println(r.Add(2, 3));
        System.out.println(r.Add(2, 3, 5));
    }
}

// Change the name of the file to OverLoadingAddition1.

// Method overloading changing datatype of argument.

// public class OverLoadingAddition1{
// int Add(int a, int b){
// return a + b;
// }

// double Add(double a, double b){
// return a + b;
// }

// public static void main(String[] args) {
// OverLoadingAddition1 r = new OverLoadingAddition1();
// System.out.println(r.Add(5, 6));
// System.out.println(r.Add(5.6, 6.4));
// }
// }
