// Auto boxing

// Primitive datatype to its corresponding wrapper class.

public class WrapperExp1 {
    public static void main(String[] args) {
        int a = 10;
        Integer i = Integer.valueOf(a);
        Integer j = a;
        System.out.println(a + " " + i + " " + j);
    }
}
