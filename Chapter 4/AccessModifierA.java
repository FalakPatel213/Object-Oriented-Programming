package p1;

public class AccessModifierA {
    public int a = 10;
    private int b = 20;
    int c = 30;
    protected int d = 40;

    public static void main(String[] args) {
        AccessModifierA a = new AccessModifierA();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
    }
}

// Public variable can be accessed in any class whether it is child of this class or not and inside and outside the package.
// Private variable can be accessed in only the class that it is declared.
// Default variable can be accessed in the same package.
// Protected variables can be accessed in inside package and outside package(child of that class).