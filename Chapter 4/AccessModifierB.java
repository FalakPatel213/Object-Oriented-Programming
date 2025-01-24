package p1;

public class AccessModifierB {
    public static void main(String[] args) {
        AccessModifierA a = new AccessModifierA();
        System.out.println("a = " + a.a);
        // System.out.println("b = " + a.b);     // b cannot be accessed in other class coz it is private.
        System.out.println("c = " + a.c);     // c can be accessed in other class coz it is default.
        System.out.println("d = " + a.d);     // d can be accessed in other class coz it is protected.
    }
}
