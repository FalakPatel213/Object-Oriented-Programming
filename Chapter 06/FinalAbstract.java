abstract class Base {
    final void fun () {
        System.out.println("Base fun() called.");
    }
}

class FinalAbstract extends Base {
    public static void main (String[] args) {
        Base b = new FinalAbstract();
        b.fun();
    }
}