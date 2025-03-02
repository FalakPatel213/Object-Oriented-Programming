abstract class Base {
    abstract void method();
    Base () {
        System.out.println("Base class Constuctor.");
    }
}

class AbstractEx extends Base {
    void method () {
        System.out.println("Derived class method called.");
    }
    public static void main (String args[]) {
        Base b = new AbstractEx();
        b.method();
    }
}