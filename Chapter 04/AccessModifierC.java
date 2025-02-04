package p2;
import p1.AccessModifierA;

public class AccessModifierC extends AccessModifierA{
    public static void main(String[] args) {
        AccessModifierA a = new AccessModifierA();
        // System.out.println("a = " + a.a);        // a is accessible.
        // System.out.println("b = " + a.b);        // b is not accessible.
        // System.out.println("c = " + a.c);        // c is not accessible.
        // System.out.println("d = " + a.d);        // d is not accessible.

        AccessModifierC c = new AccessModifierC();
        // System.out.println("a = " + c.a);          // a is accessible, coz it is public.
        // System.out.println("b = " + c.b);          // b is not accessible.
        // System.out.println("c = " + c.c);          // c is not accessible.
        // System.out.println("d = " + c.d);          // d is accessible, coz C is child of A.
    }
}
