public class Car {
    static int wheels; // It will assign a single block of memory named "wheels" and whenever we
                       // upadate into the "wheels" through any object, the value of wheels will
                       // over-write, it will not assign new memory block.

    public static void main(String args[]) {
        Car c = new Car();
        Car b = new Car();
        c.wheels = 2; // When we update this value it will change into the "wheels" memory block.
        b.wheels = 3; // It will over-write the "wheels" from "2" to "3".
        System.out.println(wheels);
        System.out.println(c.wheels);
        System.out.println(b.wheels);
    }
}

// Answer : 3 3 3