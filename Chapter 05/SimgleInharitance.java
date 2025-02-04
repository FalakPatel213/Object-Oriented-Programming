// Here, Base is the parent of Derived.
// Derived class can access the methods of Base.

// class Base{
//     int basev = 10;
//     public void base(){
//         System.out.println("Base : mathod called");
//     }
// }

// class Derived extends Base{
//     int derivedv = 20;

//     public void derived(){
//         System.out.println("Derived : method called");
//     }
// }

// public class SimgleInharitance {
//     public static void main(String[] args) {
//         Derived d = new Derived();
//         // Base d = new Base();
//         System.out.println("Base var is = " + d.basev);
//         d.base();
//         System.out.println("Derived var is " + d.derivedv);
//         d.derived();
//     }
// }

//##############################################################################

// Here, Derived is the parent of Base.
// Base class can access the methods of Derived.

class Base extends Derived{
    int basev = 10;
    public void base(){
        System.out.println("Base : mathod called");
    }
}

class Derived{
    int derivedv = 20;

    public void derived(){
        System.out.println("Derived : method called");
    }
}

public class SimgleInharitance {
    public static void main(String[] args) {
        // Derived d = new Derived();
        Base d = new Base();
        System.out.println("Base var is = " + d.basev);
        d.base();
        System.out.println("Derived var is " + d.derivedv);
        d.derived();
    }
}


// Parent cannot access the property of child's property.