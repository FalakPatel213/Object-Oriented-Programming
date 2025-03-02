// Write program to demonstrate that an abstract class can have data fields, abstract methods, final concrete method, concrete method and a constructor.

abstract class Bike {
    double speed = 80.5;
    Bike () {
        System.out.println("Bike is created.");
    }
    abstract void run ();
    final void changeGear () {
        System.out.println("Gear changed.");
    }

    void method () {
        System.out.println("Concrete method.");
    }
}

class Honda extends Bike {
    void run () {
        System.out.println("Run honda.");
    }
}

class Hero extends Bike {
    void run () {
        System.out.println("Run hero.");
    }
}

class AbsractAllEx {
    public static void main(String[] args) {
        Bike b = new Honda();
        b.run();
        b.changeGear();
    }
}