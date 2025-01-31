class Fruit{
    String color = "yellow";
}

class Apple extends Fruit{
    String color = "red";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class Super2 {
    public static void main(String[] args) {
        Apple a = new Apple();
        a.printColor();
    }
}
