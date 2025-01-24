// Here "this" keyword is used to call the constructor.

public class Circle {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    Circle() {
        this(1.0);
    }

    void display() {
        System.out.println(radius);
    }

    public static void main(String args[]) {
        Circle c1 = new Circle();
        c1.display();
        Circle c2 = new Circle(3.4);
        c2.display();
    }
}