// Auto unboxing

//  Wrapper to primitive.

public class WrapperExp2 {
    public static void main(String[] args) {
        Integer a = new Integer(5);     // Integer a = 5;     it will be same.
        int i = a.intValue();
        int j = a;
        System.out.println(a + " " + i + " " + j);
    }
}
